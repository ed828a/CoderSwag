package com.example.edward.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.edward.coderswag.Model.Product
import com.example.edward.coderswag.R
import com.example.edward.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product: Product = intent.getParcelableExtra(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        imageViewProduct.setImageResource(resourceId)
        textViewTitle.text = product.title
        textViewPrice.text = product.price
    }
}
