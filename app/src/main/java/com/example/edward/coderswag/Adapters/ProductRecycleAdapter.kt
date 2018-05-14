package com.example.edward.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edward.coderswag.Model.Product
import com.example.edward.coderswag.R
import kotlinx.android.synthetic.main.product_in_cell.view.*

/*
 * Created by Edward on 5/13/2018.
 */

class ProductRecycleAdapter(val context: Context,
                            val products: List<Product>,
                            val itemClick: (Product) -> Unit):
        RecyclerView.Adapter<ProductRecycleAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(productView: View?) :
            RecyclerView.ViewHolder(productView) {
        // itemView is a property of RecyclerView class (RecyclerView.java)
        val productImage = itemView?.imageViewProduct
        val productName = itemView?.textViewProductTitle
        val productPrice = itemView?.textViewProductPrice

        fun setOnItemClickListener(product: Product){
           itemView?.setOnClickListener { itemClick(product) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_in_cell, parent, false)

        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int = products.count()

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        val imageId = context.resources.getIdentifier(product.image,
                "drawable", context.packageName)

        holder.productImage?.setImageResource(imageId)
        holder.productName?.text = product.title
        holder.productPrice?.text = product.price

        holder.setOnItemClickListener(product)
    }


}