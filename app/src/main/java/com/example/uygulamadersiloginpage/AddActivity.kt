package com.example.uygulamadersiloginpage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.uygulamadersiloginpage.databinding.ActivityAddBinding
import com.example.uygulamadersiloginpage.databinding.ActivityGoogleSignupBinding

class AddActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            val noteModel = NoteModel("Başlık", "Tip", "Açıklama", 1)
            val addNoteIntent = Intent(this@AddActivity, ResultActivity::class.java)
            addNoteIntent.putExtra("noteModel", noteModel) // Yeni öğe verisi
            startActivity(addNoteIntent)
        }
    }
}
