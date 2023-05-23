package com.landfathich.dreamfilm

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.landfathich.dreamfilm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnMenu.setOnClickListener {
            Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show()
        }

        binding.btnFavorites.setOnClickListener {
            Toast.makeText(this, "Favorites", Toast.LENGTH_SHORT).show()
        }

        binding.btnSelections.setOnClickListener {
            Toast.makeText(this, "Selections", Toast.LENGTH_SHORT).show()
        }

        binding.btnWatchLater.setOnClickListener {
            Toast.makeText(this, "Watch later", Toast.LENGTH_SHORT).show()
        }

        binding.btnSettings.setOnClickListener {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
        }

    }
}