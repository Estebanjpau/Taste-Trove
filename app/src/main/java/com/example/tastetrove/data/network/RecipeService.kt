package com.example.tastetrove.data.network

import com.example.tastetrove.data.models.RecipeCategoriesResponseModel
import com.example.tastetrove.data.models.RecipeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RecipeService @Inject constructor(private val api: RecipeAPI, private val categoryApi: RecipeCategoryAPI) {

    suspend fun getRecipes(): List<RecipeModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllRecipes()
            response.body() ?: emptyList()
        }
    }

    suspend fun getRecipesCategories(): RecipeCategoriesResponseModel?{
        return withContext(Dispatchers.IO){
            val response = categoryApi.getRecipesCategories()

            println(response.body())
            response.body()
        }
    }

//    suspend fun searchByRecipesCategories(): List<RecipeCategoriesModel>{
//        return withContext(Dispatchers.IO){
//            val response = categoryApi.getRecipesCategories()
//            response.body() ?: emptyList()
//        }
//    }
}