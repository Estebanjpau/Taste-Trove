package com.example.tastetrove.data.network

import com.example.tastetrove.data.models.RecipeCategoriesModel
import com.example.tastetrove.data.models.RecipeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RecipeService @Inject constructor(private val api: RecipeAPI) {

    suspend fun getRecipes(): List<RecipeModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllRecipes()
            response.body() ?: emptyList()
        }
    }

    suspend fun getRecipesCategories(): List<RecipeCategoriesModel>{
        return withContext(Dispatchers.IO){
            val response = api.getRecipesCategories()
            response.body() ?: emptyList()
        }
    }

    suspend fun searchByRecipesCategories(): List<RecipeCategoriesModel>{
        return withContext(Dispatchers.IO){
            val response = api.getRecipesCategories()
            response.body() ?: emptyList()
        }
    }
}