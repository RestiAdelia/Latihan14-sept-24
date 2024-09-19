package com.restiadelia.homepoli.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.homepoli.DetailFoto
import com.restiadelia.homepoli.R
import com.restiadelia.homepoli.model.ModelGaler

class AdapterGaleri(
    private val context: Context,
    private val imageList: List<ModelGaler>
) : RecyclerView.Adapter<AdapterGaleri.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.gambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Pastikan layout item_galeri.xml yang benar digunakan di sini
        val view = LayoutInflater.from(context).inflate(R.layout.item_galeri, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = imageList[position]
        holder.imageView.setImageResource(model.imageResId)

        holder.itemView.setOnClickListener {
            // Menggunakan DetailFoto untuk menampilkan gambar yang diklik
            val intent = Intent(context, DetailFoto::class.java)
            intent.putExtra("imageResId", model.imageResId)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}
