package com.example.myapplication.db_pkg

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Sonam-11 on 20/5/20.
 */
@Entity(tableName = "MyUserDataModel")
data class MyUserDataModel(
    @ColumnInfo(name = "user_name")  var userName: String
    , @ColumnInfo(name = "user_pass") var userPass: String){
    @PrimaryKey (autoGenerate = true) var uId: Int = 0

}