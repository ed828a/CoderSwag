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
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslops Graphic Beanie", "$18", "hat01"),
            Product("Devslops Hat Black", "$20", "hat02"),
            Product("Devslops Hat White", "$18", "hat03"),
            Product("Devslops Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslops Hoodie Gray", "$28", "hoodie01"),
            Product("Devslops Hoodie Red", "$32", "hoodie02"),
            Product("Devslops Gray Hoodie", "$28", "hoodie03"),
            Product("Devslops Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslops Shirt Black", "$18", "shirt01"),
            Product("Devslops Badge Light Gray", "$20", "shirt02"),
            Product("Devslops Logo Shirt Red", "$22", "shirt03"),
            Product("Devslops Hustle", "$22", "shirt04"),
            Product("Kickflip Studios", "$18", "shirt05")
    )
}