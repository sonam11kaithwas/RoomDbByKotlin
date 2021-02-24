package com.example.myapplication.db_pkg

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


/**
 * Created by Sonam-11 on 20/5/20.
 */
@Database(entities = [MyUserDataModel::class], version = 1)
abstract class UserDataBase : RoomDatabase() {

    abstract fun userDataDao(): MyUserDataDao

    companion object {
        private var INSTANCE: UserDataBase? = null

        fun getUserDataBaseAppinstance(context: Context): UserDataBase? {
            if (INSTANCE == null) {
                synchronized(UserDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context, UserDataBase::class.java, "userdatabase.db").allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

    }
}