package com.example.phonebook.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.phonebook.database.TagDbModel

@Dao
interface TagDao {
    @Query("SELECT * FROM TagDbModel")
    fun getAll(): LiveData<List<TagDbModel>>

    @Query("SELECT * FROM TagDbModel")
    fun getAllSync(): List<TagDbModel>

    @Insert
    fun insertAll(vararg tagDbModels: TagDbModel)
}