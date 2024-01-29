package com.example.tastetrove.data

data class Recipe(
    val name: String,
    val id: String,
    val steps: String,
    val image: String,
    val ingredients: String,
    val review: Double
)
