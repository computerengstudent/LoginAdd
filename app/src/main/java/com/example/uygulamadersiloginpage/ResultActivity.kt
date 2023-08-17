package com.example.uygulamadersiloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.uygulamadersiloginpage.databinding.ActivityMainBinding
import com.example.uygulamadersiloginpage.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private lateinit var  noteArrayList : ArrayList<NoteModel>
    private lateinit var adapter:NoteAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        noteArrayList = intent.getParcelableArrayListExtra("noteArrayList") ?: ArrayList()

        val recyclerView: RecyclerView = findViewById(R.id.rv)

        noteArrayList =ArrayList <NoteModel> ()

        val f1 = NoteModel ("haftalık ihtiyaçlar", "alışveriş","" ,1)
        val f2 = NoteModel ("haftalık ihtiyaçlar", "alışveriş","" ,2)
        val f3 = NoteModel ("haftalık ihtiyaçlar", "alışveriş","" ,3)
        val f4 = NoteModel ("haftalık ihtiyaçlar", "alışveriş","" ,4)
        val f5 = NoteModel ("haftalık ihtiyaçlar", "alışveriş","" ,5)
        val f6 = NoteModel ("haftalık ihtiyaçlar", "alışveriş","" ,6)


        noteArrayList.add(f1)
        noteArrayList.add(f2)
        noteArrayList.add(f3)
        noteArrayList.add(f4)
        noteArrayList.add(f5)
        noteArrayList.add(f6)


        adapter = NoteAdapter (this, noteArrayList)
        binding.rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        binding.rv.setHasFixedSize(true)
        binding.rv.adapter = adapter

    }

}


