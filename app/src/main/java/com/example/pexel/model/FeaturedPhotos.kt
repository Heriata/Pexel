package com.example.pexel.model

import com.google.gson.annotations.SerializedName


data class FeaturedPhotos (

    @SerializedName("collections"   ) var collections  : ArrayList<Collections> = arrayListOf(),
    @SerializedName("page"          ) var page         : Int?                   = null,
    @SerializedName("per_page"      ) var perPage      : Int?                   = null,
    @SerializedName("total_results" ) var totalResults : Int?                   = null,
    @SerializedName("next_page"     ) var nextPage     : String?                = null,
    @SerializedName("prev_page"     ) var prevPage     : String?                = null

)

data class Collections (

    @SerializedName("id"           ) var id          : String?  = null,
    @SerializedName("title"        ) var title       : String?  = null,
    @SerializedName("description"  ) var description : String?  = null,
    @SerializedName("private"      ) var private     : Boolean? = null,
    @SerializedName("media_count"  ) var mediaCount  : Int?     = null,
    @SerializedName("photos_count" ) var photosCount : Int?     = null,
    @SerializedName("videos_count" ) var videosCount : Int?     = null

)