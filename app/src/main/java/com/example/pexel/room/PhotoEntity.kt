package com.example.pexel.room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "photos")
data class PhotoEntity (
    @PrimaryKey
    var idDb: Long,
    var id: Int,
    var width: Int,
    var height: Int,
    var name: String,
    var url: String,
    var photographer: String,
    var photographerURL: String,
    var photographerID: String,
    var srcMedium: String,
    var srcPortrait: String
)