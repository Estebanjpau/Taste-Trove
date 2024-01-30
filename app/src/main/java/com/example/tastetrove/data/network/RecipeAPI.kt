package com.example.tastetrove.data.network

import com.example.tastetrove.data.Recipe
import retrofit2.Response
import retrofit2.http.GET

interface RecipeAPI {
    @GET("/.json")
    suspend fun getAllRecipes(): Response<List<Recipe>>
}