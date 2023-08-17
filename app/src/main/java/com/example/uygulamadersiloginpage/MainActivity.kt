package com.example.uygulamadersiloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.uygulamadersiloginpage.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSignGoogle.setOnClickListener {
            val googleSignupIntent = Intent(this@MainActivity, GoogleSignupActivity::class.java)
            startActivity(googleSignupIntent)
        }

        binding.btnSignEmail.setOnClickListener {
            val emailSignupIntent = Intent(this@MainActivity, EmailSignupActivity::class.java)
            startActivity(emailSignupIntent)
        }
    }
}

