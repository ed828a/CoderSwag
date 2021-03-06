package com.example.edward.coderswag.Adapters

/*
 * Created by Edward on 5/12/2018.
 */


import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.edward.coderswag.Model.Category
import com.example.edward.coderswag.R
import kotlinx.android.synthetic.main.item_in_listcell.view.*


class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    /**
     * @position: the number that corresponds to the specific row that is being displayed.
     * @convertView: this is the view that is displayed over and over.
     * @parent: the view-group.
     * @return: view with the item properties filling in
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        if (convertView == null) {  // this is very first the view is presenting.
            categoryView = LayoutInflater.from(context).inflate(R.layout.item_in_listcell, null)
            Log.d("viewHolder", "I exist for the first time!")
        } else {  // convertView is recycled view, can be re-used.
            categoryView = convertView
            Log.d("viewHolder", "Go green, recycle!")
        }

        val category = categories[position]

        //This is the way to get resource id by resource name, and set view image.
        val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
        categoryView.imageViewCategory.setImageResource(resourceId)
        categoryView.textViewCategory.text = category.title

        return categoryView
    }

    /**
     *  we can call this function to retrieve the item that is associated with the position. At that
     *  position that the ListView happens to be at.
     */
    override fun getItem(position: Int): Any {
        return categories[position]
    }

    /**
     *  this function retrieve the unique ID for each row, the unique ID was generated by the system
     *  most of cases, the return of this function won't be used.
     */
    override fun getItemId(position: Int): Long {
        return 0
    }

    /**
     *  get the size of the list of the items, the total amount of items that is going to be displayed.
     *  this function will tell how many rows that it is going to be displaying.
     */
    override fun getCount(): Int {

        return categories.size
    }

}