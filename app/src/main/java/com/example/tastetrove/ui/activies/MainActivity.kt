package com.example.tastetrove.ui.activies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tastetrove.R
import com.example.tastetrove.databinding.ActivityMainBinding
import com.example.tastetrove.ui.fragments.FavoritesFragment
import com.example.tastetrove.ui.fragments.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.frameContainer, HomeFragment()).commit()

        binding.bnvMain.setOnItemSelectedListener{
            when(it.itemId){
                R.id.mHome -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer, HomeFragment()).commit()
                R.id.mFavorites -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer, FavoritesFragment()).commit()
            }
            true
        }
    }
}