package com.ozproject.senya.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ozproject.senya.R
import com.ozproject.senya.data.Attraction

class HomeFragmentAdapter(val attraction:List<Attraction>):RecyclerView.Adapter<HomeFragmentAdapter.HomeFragmentViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder,parent,false)
       return HomeFragmentViewHolder(view)
    }

    override fun getItemCount(): Int {
     return attraction.size
    }

    override fun onBindViewHolder(holder: HomeFragmentViewHolder, position: Int) {
        holder.Bind(attraction[position])
    }

    class HomeFragmentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {


        fun Bind(attraction: Attraction){

         val title: TextView =  itemView.findViewById(R.id.tvTitle)
         val headerImage:ImageView = itemView.findViewById(R.id.header_Image)
         val monthToVisit:TextView = itemView.findViewById(R.id.month_to_visit_TextView)

            title.text = attraction.titles
          //  Picasso.get(attraction.imageUrl).load().into(headerImage)
            monthToVisit.text=attraction.monthToVisit
        }
    }
}