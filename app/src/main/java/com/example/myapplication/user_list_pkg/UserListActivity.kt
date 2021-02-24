package com.example.myapplication.user_list_pkg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.db_pkg.UserDataBase

class UserListActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var userListAdpter: UserListAdpter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)
        setTitle("User List")
        initializeMyViews()
    }

    fun initializeMyViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        var list = UserDataBase.getUserDataBaseAppinstance(this)?.userDataDao()?.getAll()
        userListAdpter = UserListAdpter(list!!)
        recyclerView.adapter = userListAdpter
    }
}
