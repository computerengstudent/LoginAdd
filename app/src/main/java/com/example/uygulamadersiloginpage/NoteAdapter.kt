package com.example.uygulamadersiloginpage

import android.app.Instrumentation.ActivityResult
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uygulamadersiloginpage.databinding.ActivityResultBinding
import com.example.uygulamadersiloginpage.databinding.ItemNoteBinding
import com.google.android.material.appbar.AppBarLayout

class NoteAdapter(private val mContext: Context, private val NoteListesi: List <NoteModel>) :
    RecyclerView.Adapter <NoteAdapter.CardTasarimNesneleriniTutucu >() {

    inner class CardTasarimNesneleriniTutucu (val binding : ActivityResultBinding) : RecyclerView.ViewHolder(binding.root) {

        var menuResim: ImageView=  binding.menuResim




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {
        val binding = ActivityResultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardTasarimNesneleriniTutucu(binding)
    }

    override fun getItemCount(): Int {
        return NoteListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        val note = NoteListesi[position]

        val binding=holder.binding
        // binding.textView1.text = note.title
        // binding.textView2.text = note.type





        holder.menuResim.setOnClickListener {
            val popup = PopupMenu(mContext, holder.menuResim)
            popup.menuInflater.inflate(R.menu.menu, popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_add -> {
                        // "Add" menü öğesine tıklandığında
                        val intent = Intent(mContext, AddActivity::class.java)
                        mContext.startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
        }








    }
}