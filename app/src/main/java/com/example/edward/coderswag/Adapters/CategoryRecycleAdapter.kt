package com.example.edward.coderswag.Adapters

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edward.coderswag.Model.Category
import com.example.edward.coderswag.R
import kotlinx.android.synthetic.main.item_in_listcell.view.*

/*
 * Created by Edward on 5/13/2018.
 */

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>): Adapter<CategoryRecycleAdapter.Holder>() {

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView.imageViewCategory
        val categoryName = itemView.textViewCategory
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            Holder(LayoutInflater.from(context).inflate(R.layout.item_in_listcell, parent, false))


    override fun getItemCount(): Int = categories.size

    /**
     * @position: fetch item by this position
     * @holder: this is viewholder which hold child views,
     * this function fetch item by position and fill item detail data into child views of holder.
     */
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,
                                                    "drawable", context.packageName)
        holder.categoryImage.setImageResource(resourceId)
        holder.categoryName.text = category.title
    }

}