package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.db_pkg.UserDataBase
import com.example.myapplication.sign_up_pkg.SignUpActivity
import com.example.myapplication.user_list_pkg.UserListActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // UserDataBase.getUserDataBaseAppinstance(this).userDataDao().insertMyUserData()
    }

    fun startSign(view: View) {
        when (view.id) {
            R.id.sign_up_btn -> startActivity(Intent(this, SignUpActivity::class.java))
            R.id.user_list_btn -> startActivity(Intent(this, UserListActivity::class.java))
        }

    }
}
