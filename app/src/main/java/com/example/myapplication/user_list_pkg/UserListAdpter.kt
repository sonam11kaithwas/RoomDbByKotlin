package com.example.myapplication.user_list_pkg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.db_pkg.MyUserDataModel

/**
 * Created by Sonam-11 on 21/5/20.
 */
class UserListAdpter(var list: List<MyUserDataModel>) : RecyclerView.Adapter<MyVieWHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVieWHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.user_list_adpter, parent, false)
        return MyVieWHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyVieWHolder, position: Int) {
        val model: MyUserDataModel = list[position]
        holder.bindItems(model)
    }
}

class MyVieWHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var list_title: TextView? = null
    var list_description: TextView? = null

    fun bindItems(user: MyUserDataModel) {
        list_title = itemView.findViewById(R.id.list_title)
        list_description = itemView.findViewById(R.id.list_description)
        list_title?.text = user.userName
        list_description?.text = user.userPass
    }
}