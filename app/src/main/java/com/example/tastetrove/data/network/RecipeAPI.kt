package com.example.tastetrove.data.network

import com.example.tastetrove.data.models.RecipeCategoriesModel
import com.example.tastetrove.data.models.RecipeModel
import retrofit2.Response
import retrofit2.http.GET

interface RecipeAPI {
    @GET("/.json")
    suspend fun getAllRecipes(): Response<List<RecipeModel>>

    @GET("categories.php")
    suspend fun getRecipesCategories(): Response<List<RecipeCategoriesModel>>

    @GET("filter.php?c=Seafood")
    suspend fun searchByRecipesCategories(): Response<List<RecipeCategoriesModel>>
}