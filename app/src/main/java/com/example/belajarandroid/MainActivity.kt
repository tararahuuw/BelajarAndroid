package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajarandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	
	private lateinit var binding: ActivityMainBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
		
		val fragmentTransaction = supportFragmentManager.beginTransaction()
		fragmentTransaction.add(R.id.frameLayout, ProfileFragment())
		fragmentTransaction.commit()
	}
}