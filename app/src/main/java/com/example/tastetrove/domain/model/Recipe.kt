package com.example.tastetrove.domain.model

import com.example.tastetrove.data.database.entities.RecipeEntity
import com.example.tastetrove.data.models.RecipeModel

data class Recipe(
    val id: String,
    val name: String,
    val instructions: String,
    val image: String,
    val ingredient1: String,
    val ingredient2: String,
    val ingredient3: String,
    val ingredient4: String,
    val ingredient5: String,
    val ingredient6: String,
    val ingredient7: String,
    val ingredient8: String,
    val ingredient9: String,
    val ingredient10: String,
    val ingredient11: String,
    val ingredient12: String,
    val ingredient13: String,
    val ingredient14: String,
    val ingredient15: String,
    val review: Int = 0,
)

fun RecipeModel.toDomain() = Recipe(id, name, instructions, image, ingredient1, ingredient2, ingredient3, ingredient4, ingredient5, ingredient6, ingredient7, ingredient8, ingredient9, ingredient10, ingredient11, ingredient12, ingredient13, ingredient14, ingredient15)
fun RecipeEntity.toDomain() = Recipe(id, name, instructions, image, ingredient1, ingredient2, ingredient3, ingredient4, ingredient5, ingredient6, ingredient7, ingredient8, ingredient9, ingredient10, ingredient11, ingredient12, ingredient13, ingredient14, ingredient15)