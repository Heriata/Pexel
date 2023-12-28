package com.example.pexel.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.example.pexel.model.Photos


@Dao
interface PhotoDao {
    @Query("SELECT * FROM photos")
    fun getAll(): List<Any?>?

    @Query("SELECT * FROM photos WHERE id = :id")
    fun getById(id: Long): Photos?

    @Insert()
    suspend fun insert(employee: Photos?)

    @Update
    fun update(employee: Photos?)

    @Delete
    fun delete(employee: Photos?)
}