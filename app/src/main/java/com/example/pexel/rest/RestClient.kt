package com.example.pexel.rest

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RestClient {
    const val BASE_URL = "https://api.pexels.com/"
    private var retrofit: Retrofit? = null

    val client: Retrofit?
        get() {

            val gson = GsonBuilder()
                .serializeNulls()
                .create()

            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit
        }
}
