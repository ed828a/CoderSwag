package com.example.edward.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.example.edward.coderswag.Adapters.ProductRecycleAdapter
import com.example.edward.coderswag.Adapters.ProductsAdapter
import com.example.edward.coderswag.R
import com.example.edward.coderswag.R.string.product
import com.example.edward.coderswag.Services.DataService
import com.example.edward.coderswag.Utilities.EXTRA_CATEGORY
import com.example.edward.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter   // sometimes, we need this adapter outside onCreate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val products = intent.getStringExtra(EXTRA_CATEGORY)


//        recyclerViewProducts.adapter = ProductRecycleAdapter(this, DataService.getProducts(products) ){product ->
//            Toast.makeText(this, "you clicked ${product.title} : ${product.price}", Toast.LENGTH_SHORT).show()
//        }
        adapter = ProductsAdapter(this, DataService.getProducts(products)){ product ->
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra(EXTRA_PRODUCT, product)
            startActivity(intent)

        }
        recyclerViewProducts.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 4
        }

        val layoutManager = GridLayoutManager(this,2)
        recyclerViewProducts.layoutManager = layoutManager
        recyclerViewProducts.setHasFixedSize(true)
    }
}
