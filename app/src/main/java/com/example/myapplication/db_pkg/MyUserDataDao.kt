package com.example.myapplication.db_pkg

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


/**
 * Created by Sonam-11 on 20/5/20.
 */
@Dao
interface MyUserDataDao {
    @Insert
    fun insertMyUserData(vararg userdata:MyUserDataModel)

    @Query("SELECT * FROM MyUserDataModel")
    fun getAll(): List<MyUserDataModel>

}