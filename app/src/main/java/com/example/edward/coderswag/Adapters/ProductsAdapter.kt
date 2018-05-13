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

class ProductsAdapter(val context: Context, val products: List<Product>,
                      val itemClick: (Product) -> Unit) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_in_cell, parent, false)

        return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int = products.count()

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View?, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.imageViewProduct
        val productName = itemView?.textViewProductTitle
        val productPrice = itemView?.textViewProductPrice

        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }
    }


}