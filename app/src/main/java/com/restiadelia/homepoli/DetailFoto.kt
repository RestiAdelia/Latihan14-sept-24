package com.restiadelia.homepoli

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailFoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_foto)

        val detailImageView: ImageView = findViewById(R.id.gambar)

        // Ambil imageResId yang dikirim dari AdapterGaleri
        val imageResId = intent.getIntExtra("imageResId", 0)

        // Set gambar ke ImageView
        if (imageResId != 0) {
            detailImageView.setImageResource(imageResId)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
