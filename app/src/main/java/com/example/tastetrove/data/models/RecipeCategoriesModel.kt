package com.example.tastetrove.data.models

import com.google.gson.annotations.SerializedName

data class RecipeCategoriesModel(
    @SerializedName("idCategory") val categoryId: String,
    @SerializedName("strCategory") val categoryName: String,
    @SerializedName("strCategoryThumb") val categoryImage: String,
    @SerializedName("strCategoryDescription") val categoryDescription: String,
)