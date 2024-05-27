package com.example.recycle_view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    lateinit var  recyclerView: RecyclerView
    lateinit var adapter : CountryAdapter
    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView =findViewById(R.id.Recycle)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        countryNameList.add("India")
        countryNameList.add("Germany")
        countryNameList.add("UAE")
        countryNameList.add("UK")
        detailsList.add("this is the flag of India")
        detailsList.add("this is the flag of Germany")
        detailsList.add("this is the flag of UAE")
        detailsList.add("this is the flag of uk")
    imageList.add(R.drawable.india)
        imageList.add(R.drawable.germany)
        imageList.add(R.drawable.uae)
        imageList.add(R.drawable.uk)

        adapter = CountryAdapter(countryNameList, detailsList, imageList, this@MainActivity)
        recyclerView.adapter = adapter
    }

}