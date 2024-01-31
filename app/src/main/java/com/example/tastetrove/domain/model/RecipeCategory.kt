package com.example.tastetrove.domain.model

import com.example.tastetrove.data.models.RecipeCategoriesModel
import com.example.tastetrove.data.models.RecipeCategoriesResponseModel

data class RecipeCategoriesResponse(
    val categories: RecipeCategory
)
data class RecipeCategory(
    val categoryId: String,
    val categoryName: String,
    val categoryImage: String,
    val categoryDescription: String,
)

fun RecipeCategoriesModel.toDomain() = RecipeCategory(categoryId, categoryName, categoryImage, categoryDescription)
fun RecipeCategoriesResponseModel?.toRecipeCategoryList(): List<RecipeCategory> {
    return this?.categories?.map { it.toDomain() } ?: emptyList()
}

