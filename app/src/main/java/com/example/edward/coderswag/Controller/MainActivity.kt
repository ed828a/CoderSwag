package com.example.edward.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.edward.coderswag.Model.Category
import com.example.edward.coderswag.R
import com.example.edward.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter<Category>(this,
                android.R.layout.simple_list_item_1,
                DataService.categories)

        listViewCategories.adapter = adapter
    }
}
