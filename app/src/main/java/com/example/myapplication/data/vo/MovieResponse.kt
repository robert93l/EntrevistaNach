package com.example.myapplication.data.vo


import com.google.gson.annotations.SerializedName
import com.roberto1.entrevista.data.vo.Movie

data class MovieResponse(
    val page: Int,
    @SerializedName("results")
    val movieList: List<Movie>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)