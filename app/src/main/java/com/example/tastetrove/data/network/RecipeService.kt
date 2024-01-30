package com.example.tastetrove.data.network

import com.example.tastetrove.data.Recipe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RecipeService @Inject constructor(private val api: RecipeAPI) {

    suspend fun getRecipes(): List<Recipe>{
        return withContext(Dispatchers.IO){
            val response = api.getAllRecipes()
            response.body() ?: emptyList()
        }
    }

}