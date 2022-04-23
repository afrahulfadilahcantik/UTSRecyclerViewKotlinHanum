package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val makananList = listOf<Makanan>(
            Makanan(
                R.drawable.makanan1,
                "Mie Bakso ",
                "Mie Bakso Harga: Rp.15.000"
            ),
            Makanan(
                R.drawable.makanan2,
                "Mie Ayam",
                "Mie Ayam Harga: Rp15.000"
            ),
            Makanan(
                R.drawable.makanan3,
                "Nasi Goreng",
                "Nasi Goreng Harga: Rp12.000"
            ),
            Makanan(
                R.drawable.makanan4,
                "Ayam Penyet",
                "Ayam Penyet Harga: Rp18.000"
            ),
            Makanan(
                R.drawable.makanan5,
                "Ayam Geprek",
                "Ayam Geprek Harga: Rp18.000"
            ),
            Makanan(
                R.drawable.makanan6,
                "Martabak Mesir",
                "Martabak Mesir Harga: Rp15.000"
            ),
            Makanan(
                R.drawable.makanan7,
                "Mie Goreng",
                "Mie Goreng Harga: Rp10.000"
            ),
            Makanan(
                R.drawable.makanan8,
                "Mie Rebus",
                "Mie Rebus Harga: Rp10.000"
            ),
            Makanan(
                R.drawable.makanan9,
                "Mie Aceh",
                "Mie Aceh Harga: Rp15.000"
            ),
            Makanan(
                R.drawable.makanan10,
                "Nasi Lemak",
                "Nasi Lemak Harga: Rp12.000"
            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakananAdapter(this, makananList){

            val intent = Intent (this, DetailMakananActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}