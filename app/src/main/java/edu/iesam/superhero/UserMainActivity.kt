package edu.iesam.superhero

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superhero.feature.user.data.UserDataRepository
import edu.iesam.superhero.feature.user.data.local.UserMemLocalDataSource
import edu.iesam.superhero.feature.user.domain.GetUsersUseCase
import edu.iesam.superhero.feature.user.domain.UserRepository
import edu.iesam.superhero.feature.user.presentation.UserMainViewModel

class UserMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val userMainViewModel = UserMainViewModel(GetUsersUseCase(UserDataRepository(
            UserMemLocalDataSource())))

        Log.d(TAG,"onCreate: ${userMainViewModel.getUsers()}")

        val inputName = findViewById<TextView>(R.id.input_name)
        inputName.text = userMainViewModel.getUsers().first().name

    }
    companion object{
        val TAG = UserMainActivity::class.java.simpleName
    }
}