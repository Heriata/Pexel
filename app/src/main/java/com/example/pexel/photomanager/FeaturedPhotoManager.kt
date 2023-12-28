package com.example.pexel.photomanager

import android.util.Log
import com.example.pexel.model.FeaturedPhotos
import com.example.pexel.rest.RestClient
import com.example.pexel.webservices.APIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FeaturedPhotoManager {

    private val TAG: String = "Checking response"
    private val featured: ArrayList<String?> = ArrayList()

    fun fetchFeatured(apiKey: String, perPage: Int) {
        val apiService = RestClient.client!!.create(APIService::class.java)

        val call: Call<FeaturedPhotos> = apiService.fetchFeatured(apiKey, perPage)
        call.enqueue(object : Callback<FeaturedPhotos> {
            override fun onResponse(
                call: Call<FeaturedPhotos>,
                response: Response<FeaturedPhotos>
            ) {
                if(response.isSuccessful){
                    for(title in response.body()?.collections!!){
                        featured.add(title.title)
                    }
                }
            }
            override fun onFailure(call: Call<FeaturedPhotos>, t: Throwable) {
                Log.e(TAG, "onFailure: " + t.localizedMessage)
            }

        })
    }
}