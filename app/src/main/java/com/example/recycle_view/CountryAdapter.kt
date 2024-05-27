package com.example.recycle_view

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(
    var countryNameList: ArrayList<String>,
    var detailsList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
) : RecyclerView.Adapter<CountryAdapter.CountryViewholder>() {
  class CountryViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textViewCountryname: TextView = itemView.findViewById(R.id.countryName)
    var textViewDetails: TextView = itemView.findViewById(R.id.detail)
    var imageView: CircleImageView = itemView.findViewById(R.id.profile_image)
    var cardView: CardView = itemView.findViewById(R.id.CardView)
  }

  @SuppressLint("SuspiciousIndentation")
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewholder {
    val view: View =
        LayoutInflater.from(parent.context)
            .inflate(
                /* resource = */ R.layout.card_design,
                /* root = */ parent,
                /* attachToRoot = */ false)
    return CountryViewholder(view)
  }

  override fun getItemCount(): Int {
    return countryNameList.size
  }

  override fun onBindViewHolder(holder: CountryViewholder, position: Int) {
    holder.textViewCountryname.text = countryNameList.get(position)
    holder.textViewDetails.text = detailsList.get(position)
    holder.imageView.setImageResource(imageList.get(position))
    holder.cardView.setOnClickListener {Toast.makeText(context, "You clicked on ${countryNameList.get(position)}", LENGTH_SHORT).show()}
  }
}
