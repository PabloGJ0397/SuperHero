package edu.iesam.superhero.feature.superhero.presentation

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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

        val superheroMainViewModel = SuperHeroMainViewModel(
            GetSuperheroesUseCase(
                SuperheroDataRepository(SuperheroMemLocalDataSource())
            )
        )

        Log.d(TAG, "onCreate: ${superheroMainViewModel.getSuperheroes()}")

        val inputName = findViewById<TextView>(R.id.input_sh_name)
        inputName.text = superheroMainViewModel.getSuperheroes().first().name
    }

    companion object{
        val TAG = SuperheroActivity::class.java.simpleName
    }
}
