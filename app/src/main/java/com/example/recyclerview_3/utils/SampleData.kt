package com.example.recyclerview_3.utils

import com.example.recyclerview_3.adapter.MovieAdapter
import com.example.recyclerview_3.model.MainModel
import com.example.recyclerview_3.model.MovieModel

object SampleData {

    private  val MovieModel= listOf(
        MovieModel(Images.imageUrl0),
                MovieModel(Images.imageUrl1),
                MovieModel(Images.imageUrl2),
                MovieModel(Images.imageUrl3),
                MovieModel(Images.imageUrl4),
                MovieModel(Images.imageUrl5),
                MovieModel(Images.imageUrl6),
                MovieModel(Images.imageUrl7),
                MovieModel(Images.imageUrl8),
                MovieModel(Images.imageUrl9)
    )
    val collection= listOf(
        MainModel("All Movie", MovieModel),
        MainModel("want to see", MovieModel.reversed()),
        MainModel("Popular movie", MovieModel.shuffled()),
        MainModel("Top Rated Movie", MovieModel),

    )
}