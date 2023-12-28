package com.example.pexel.Main

import android.app.Application
import android.arch.persistence.room.Room
import com.example.pexel.room.AppDatabase


class App : Application() {
    var database: AppDatabase? = null
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, AppDatabase::class.java, "photos")
            .build()
    }

    companion object {
        var instance: App? = null
    }
}