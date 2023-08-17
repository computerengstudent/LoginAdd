package com.example.uygulamadersiloginpage


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uygulamadersiloginpage.databinding.ActivityEmailSignupBinding
import com.google.android.material.snackbar.Snackbar

class EmailSignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmailSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val email = binding.email
        val sifre = binding.emailsifre
        binding.btnEmailGiris.setOnClickListener {
            if (email.text.isEmpty() || sifre.text.isEmpty()) {
                Snackbar.make(it, "Boş alanları doldurun", Snackbar.LENGTH_SHORT).show()
            } else {
                val yeniIntent = Intent(this@EmailSignupActivity, ResultActivity:: class.java)
                startActivity(yeniIntent)
            }
        }
    }
}
