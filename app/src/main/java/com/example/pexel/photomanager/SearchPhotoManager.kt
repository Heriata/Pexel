package com.example.pexel.photomanager

import android.util.Log
import com.example.pexel.Main.App
import com.example.pexel.model.FeaturedPhotos
import com.example.pexel.webservices.APIService
import com.example.pexel.model.Photos
import com.example.pexel.model.ResponsePhoto
import com.example.pexel.rest.RestClient
import com.example.pexel.room.PhotoDao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchPhotoManager {


    private val TAG: String = "Checking response"
    private val PEXEL_URL: String = "https://api.pexels.com/"
//    private val list: ArrayList<Photos> = ArrayList()
//    private val curated: ArrayList<Curated> = ArrayList()


    fun fetchPhotos(apiKey: String, query: String, perPage: Int) {
        val apiService = RestClient.client!!.create(APIService::class.java)
//        val pDao: PhotoDao? = App.instance?.database?.photoDao()

        val call: Call<ResponsePhoto> = apiService.fetchPhotos(apiKey, query, perPage)
        call.enqueue(object : Callback<ResponsePhoto> {
            override fun onResponse(call: Call<ResponsePhoto>, response: Response<ResponsePhoto>) {
                Log.i(TAG, "onResponse: ${response.code()}")
                if (response.isSuccessful) {

                }
            }
            override fun onFailure(call: Call<ResponsePhoto>, t: Throwable) {
                Log.e(TAG, "Got error : " + t.localizedMessage)
            }
        })
    }
}