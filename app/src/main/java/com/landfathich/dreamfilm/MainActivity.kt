package com.landfathich.dreamfilm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.landfathich.dreamfilm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initNavigation()
    }

    private fun initNavigation() {
        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    // Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.favorites -> {
                    // Toast.makeText(this, "Favorites", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.watch_later -> {
                    // Toast.makeText(this, "Watch later", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.selections -> {
                    // Toast.makeText(this, "Selections", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }
    }
}