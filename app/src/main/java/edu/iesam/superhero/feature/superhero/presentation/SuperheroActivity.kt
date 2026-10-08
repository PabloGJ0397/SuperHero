package edu.iesam.superhero.feature.superhero.presentation

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import edu.iesam.superhero.R
import edu.iesam.superhero.feature.superhero.data.SuperheroDataRepository
import edu.iesam.superhero.feature.superhero.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.superhero.domain.GetSuperheroesUseCase

class SuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.superhero_activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val superheroListViewModel = SuperHeroListViewModel(
            GetSuperheroesUseCase(
                SuperheroDataRepository(SuperheroMemLocalDataSource())
            )
        )

        Log.d(TAG, "onCreate: ${superheroListViewModel.getSuperheroes()}")

        val container = findViewById<LinearLayout>(R.id.shaLlCards)
        val shList = superheroListViewModel.getSuperheroes()
        for(superhero in shList){
            val card = layoutInflater.inflate(R.layout.superhero_card,container,false)
            val name = card.findViewById<TextView>(R.id.shaTvNombre)
            val slug = card.findViewById<TextView>(R.id.shaTvSlug)
            val photo = card.findViewById<ImageView>(R.id.shaIvFoto)
            name.text = superhero.name
            slug.text = superhero.slug
            // Glide: with(contexto) → load(url) → configuración → into(ImageView)
            Glide.with(this)                // "this" = la Activity (Glide cancela la descarga si se cierra)
                .load(superhero.urlimage)   // la URL del héroe (si está vacía, entra el placeholder)
                .placeholder(R.drawable.image_placeholder) // imagen que se ve mientras descarga
                .error(R.drawable.image_placeholder)       // imagen que se ve si la descarga falla
                .into(photo)                 // el ImageView de la tarjeta
            container.addView(card)
        }
    }
    companion object{
        val TAG = SuperheroActivity::class.java.simpleName
    }
}
