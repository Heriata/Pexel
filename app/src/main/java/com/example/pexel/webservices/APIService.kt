package com.example.pexel.webservices

import com.example.pexel.model.FeaturedPhotos
import com.example.pexel.model.ResponsePhoto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface APIService {

    @GET("/v1/search")
    fun fetchPhotos(
        @Header("Authorization") API_KEY: String,
        @Query("query") word: String,
        @Query("per_page") perPage: Int,
    ): Call<ResponsePhoto>


    @GET("/v1/curated")
    fun fetchCurated(
        @Header("Authorization") API_KEY: String,
        @Query("per_page") perPage: Int,
    )

    @GET("/v1/collections/featured")
    fun fetchFeatured(
        @Header("Authorization") API_KEY: String,
        @Query("per_page") perPage: Int
    ): Call<FeaturedPhotos>
}