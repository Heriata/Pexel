package com.example.pexel.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.pexel.model.Photos

@Database(
    entities = [Photos::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao(): PhotoDao?
}