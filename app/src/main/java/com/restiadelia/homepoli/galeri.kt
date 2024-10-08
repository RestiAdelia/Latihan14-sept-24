package com.restiadelia.homepoli

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.homepoli.adapter.AdapterGaleri
import com.restiadelia.homepoli.model.ModelGaler

class galeri : AppCompatActivity() {
    private lateinit var rv_data: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri)

        rv_data = findViewById(R.id.rc_data)
        val imageList = listOf(
            ModelGaler(R.drawable.mi),
            ModelGaler(R.drawable.tk),
            ModelGaler(R.drawable.logo),
            ModelGaler(R.drawable.ticup),
            ModelGaler(R.drawable.tsa),
            ModelGaler(R.drawable.work),
            ModelGaler(R.drawable.badmintonti),
            ModelGaler(R.drawable.trpl),
            ModelGaler(R.drawable.tsa),
            ModelGaler(R.drawable.work),
            ModelGaler(R.drawable.badmintonti),
            ModelGaler(R.drawable.trpl),
        )

        val nGaleriAdapter = AdapterGaleri(this, imageList)
        rv_data.apply {
            layoutManager = GridLayoutManager(this@galeri, 2)
            adapter = nGaleriAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
