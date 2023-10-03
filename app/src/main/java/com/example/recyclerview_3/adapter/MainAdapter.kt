package com.example.recyclerview_3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_3.R
import com.example.recyclerview_3.databinding.ParentItemBinding
import com.example.recyclerview_3.model.MainModel

class MainAdapter(private val collection: List<MainModel>):RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun getItemCount()=collection.size

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreMovie.text=collection.title
            val movieAdapter=MovieAdapter(collection.movieModels)
            rvMovieChild.adapter=movieAdapter
        }
    }

    inner class CollectionViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val binding=ParentItemBinding.bind(itemView)
    }

}