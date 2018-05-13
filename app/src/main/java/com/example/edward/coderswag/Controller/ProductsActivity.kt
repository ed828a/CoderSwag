package com.example.edward.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.example.edward.coderswag.Adapters.ProductRecycleAdapter
import com.example.edward.coderswag.R
import com.example.edward.coderswag.Services.DataService
import com.example.edward.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val products = intent.getStringExtra(EXTRA_CATEGORY)


        recyclerViewProducts.adapter = ProductRecycleAdapter(this, DataService.getProducts(products) ){product ->
            Toast.makeText(this, "you clicked ${product.title} : ${product.price}", Toast.LENGTH_SHORT).show()
        }

        val layoutManager = GridLayoutManager(this,2)
        recyclerViewProducts.layoutManager = layoutManager
        recyclerViewProducts.setHasFixedSize(true)
    }
}
