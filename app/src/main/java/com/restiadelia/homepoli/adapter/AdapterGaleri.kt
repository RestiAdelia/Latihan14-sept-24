package com.restiadelia.homepoli.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.homepoli.R
import com.restiadelia.homepoli.model.ModelGaler


class AdapterGaleri(private val itemList: List<ModelGaler>) :
    RecyclerView.Adapter<AdapterGaleri.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.gambar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterGaleri.MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_detailfoto, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterGaleri.MyViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemImage.setImageResource(currentItem.gambar)

    }

    override fun getItemCount(): Int {
        return itemList.size

    }


}
