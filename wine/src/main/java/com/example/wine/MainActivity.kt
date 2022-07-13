package com.example.wine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alVins = arrayListOf<Vin>()
        alVins.add(Vin("Coteaux du Braden", "Chai de Quimper", 2021, "Blanc"))
        alVins.add(Vin("Vieux pape", "Je sais pas", 2018, "Rouge"))
        alVins.add(Vin("Coteaux de l'Aubance", "Château de Mauny", 2012, "Blanc"))
        alVins.add(Vin("Elodiance", "Caves du Val de France", 2016, "Rosé"))
        alVins.add(Vin("Val de Loire", "Château de Mauny", 2012, "Rouge"))
        alVins.add(Vin("Alias Pinot Noire", "Vin de Val de Loire", 2012, "Rouge"))
        alVins.add(Vin("Billecart", "Salmon Blanc de Blanc", 2002, "Champagne"))

        val rv = findViewById<RecyclerView>(R.id.recyclerViewWine)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = VinAdapter(alVins)

    }
}