package com.sanjaydevtech.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sanjaydevtech.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listView.adapter = MovieAdapter(
            listOf(
                Movie("IRON MAN", "FICTION", R.drawable.ironman),
                Movie("LOKI", "FICTION", R.drawable.loki),
                Movie("Multiverse of madness", "FICTION", R.drawable.mom),
                Movie("No Way Home", "FICTION", R.drawable.nwh),
                Movie("Love and Thunder", "FICTION", R.drawable.thor),
                Movie("Age of Ultron", "FICTION", R.drawable.ultron),
            )
        )
    }
}