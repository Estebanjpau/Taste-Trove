package com.example.tastetrove.data.network

import com.example.tastetrove.data.models.RecipeCategoriesResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface RecipeCategoryAPI {
    @GET("categories.php")
    suspend fun getRecipesCategories(): Response<RecipeCategoriesResponseModel>
}