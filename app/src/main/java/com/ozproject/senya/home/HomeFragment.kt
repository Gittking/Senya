package com.ozproject.senya.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozproject.senya.R
import com.ozproject.senya.ui.fragment.BaseFragment


class HomeFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val recyclerView  = view.findViewById<RecyclerView>(R.id.Senya_Recycler)
        super.onViewCreated(view, savedInstanceState)
        navController.navigateUp()

    }
}