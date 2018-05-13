package com.example.edward.coderswag.Services

import com.example.edward.coderswag.Model.Category
import com.example.edward.coderswag.Model.Product

/**
 * singleton to hold the list of categories and products
 */
object DataService{
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslops Graphic Beanie", "$18", "hat1"),
            Product("Devslops Hat Black", "$20", "hat2"),
            Product("Devslops Hat White", "$18", "hat3"),
            Product("Devslops Hat Snapback", "$22", "hat4"),
            Product("Devslops Graphic Beanie", "$18", "hat1"),
            Product("Devslops Hat Black", "$20", "hat2"),
            Product("Devslops Hat White", "$18", "hat3"),
            Product("Devslops Hat Snapback", "$22", "hat4"),
            Product("Devslops Graphic Beanie", "$18", "hat1"),
            Product("Devslops Hat Black", "$20", "hat2"),
            Product("Devslops Hat White", "$18", "hat3"),
            Product("Devslops Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslops Hoodie Gray", "$28", "hoodie1"),
            Product("Devslops Hoodie Red", "$32", "hoodie2"),
            Product("Devslops Gray Hoodie", "$28", "hoodie3"),
            Product("Devslops Black Hoodie", "$32", "hoodie4"),
            Product("Devslops Hoodie Gray", "$28", "hoodie1"),
            Product("Devslops Hoodie Red", "$32", "hoodie2"),
            Product("Devslops Gray Hoodie", "$28", "hoodie3"),
            Product("Devslops Black Hoodie", "$32", "hoodie4"),
            Product("Devslops Hoodie Gray", "$28", "hoodie1"),
            Product("Devslops Hoodie Red", "$32", "hoodie2"),
            Product("Devslops Gray Hoodie", "$28", "hoodie3"),
            Product("Devslops Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslops Shirt Black", "$18", "shirt1"),
            Product("Devslops Badge Light Gray", "$20", "shirt2"),
            Product("Devslops Logo Shirt Red", "$22", "shirt3"),
            Product("Devslops Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt5"),
            Product("Devslops Shirt Black", "$18", "shirt1"),
            Product("Devslops Badge Light Gray", "$20", "shirt2"),
            Product("Devslops Logo Shirt Red", "$22", "shirt3"),
            Product("Devslops Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt5"),
            Product("Devslops Shirt Black", "$18", "shirt1"),
            Product("Devslops Badge Light Gray", "$20", "shirt2"),
            Product("Devslops Logo Shirt Red", "$22", "shirt3"),
            Product("Devslops Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> = when(category){
        "SHIRTS" -> shirts
        "HOODIES" -> hoodies
        "HATS" -> hats
        else -> digitalGoods
    }
}