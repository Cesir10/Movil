package com.example.myapplication.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ListaPrimeros

class PrimerosPlatosAdapter(val PrimerosPlatosList: List<ListaPrimeros>) : RecyclerView.Adapter<PrimerosPlatosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrimerosPlatosViewHolder {

    }

    override fun getItemCount(): Int = PrimerosPlatosList.size
    }

    override fun onBindViewHolder(holder: PrimerosPlatosViewHolder, position: Int) {

}