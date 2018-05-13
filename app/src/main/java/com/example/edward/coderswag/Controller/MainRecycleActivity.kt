package com.example.edward.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.edward.coderswag.Adapters.CategoryRecycleAdapter
import com.example.edward.coderswag.R
import com.example.edward.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main_recycle.*
import kotlinx.android.synthetic.main.item_in_listcell.view.*

class MainRecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycle)

        recyclerViewCategories.adapter = CategoryRecycleAdapter(this, DataService.categories){
            Toast.makeText(this, "you clicked ${it.title}", Toast.LENGTH_SHORT).show()
        }
        recyclerViewCategories.layoutManager = LinearLayoutManager(this)
        recyclerViewCategories.setHasFixedSize(true)  // for optimization purpose
    }
}
