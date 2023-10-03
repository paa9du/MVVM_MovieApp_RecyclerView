package com.example.recyclerview_3.adapter

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recyclerview_3.R
import com.example.recyclerview_3.databinding.MovieItemBinding
import com.example.recyclerview_3.model.MovieModel

class MovieAdapter(private  val movieModel: List<MovieModel>):RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)

    }

    override fun getItemCount()=movieModel.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        holder.binding.apply {
            imgMoviePoster.load(movieModel[position].imageUrl)
        }
    }


    inner class MovieViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val binding=MovieItemBinding.bind(itemView)
    }

}