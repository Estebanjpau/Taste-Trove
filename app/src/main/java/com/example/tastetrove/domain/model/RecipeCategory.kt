package com.example.tastetrove.domain.model

import com.example.tastetrove.data.models.RecipeCategoriesModel

data class RecipeCategory(
    val categoryId: String,
    val categoryName: String,
    val categoryImage: String,
    val categoryDescription: String,
)

fun RecipeCategoriesModel.toDomain() = RecipeCategory(categoryId, categoryName, categoryImage, categoryDescription)

