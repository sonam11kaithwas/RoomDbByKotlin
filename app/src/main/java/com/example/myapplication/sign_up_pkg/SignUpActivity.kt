package com.example.myapplication.sign_up_pkg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.db_pkg.MyUserDataModel
import com.example.myapplication.db_pkg.UserDataBase
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun onClickFun(view: View) {
        when (view.id) {
            R.id.sign_up_btn -> {
                UserDataBase.getUserDataBaseAppinstance(this)!!.userDataDao()
                    .insertMyUserData(
                        MyUserDataModel(edt_uname.text.toString().trim(), edtupass.text.toString())
                    )
                Toast.makeText(this, "User Added Successfully", Toast.LENGTH_SHORT).show()
            }
            R.id.cancel_btn->{
                this.finish()
            }
        }
    }
}
