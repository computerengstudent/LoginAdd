package com.example.uygulamadersiloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uygulamadersiloginpage.databinding.ActivityGoogleSignupBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class GoogleSignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGoogleSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGoogleSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val google  = binding.Name.editText
        val sifre= binding.sifre.editText
        val hesap= binding.googleHesabi.editText


        binding.btnSignGoogle.setOnClickListener {

            if (google?.text.isNullOrEmpty() || sifre?.text.isNullOrEmpty()|| hesap?.text.isNullOrEmpty()) {
                Snackbar.make(it, "Boş alanları doldurun", Snackbar.LENGTH_SHORT).show()
            } else {
                val yeniIntent = Intent(this@GoogleSignupActivity, ResultActivity:: class.java)
                startActivity(yeniIntent)
            }
        }

    }
}