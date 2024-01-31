package com.example.tastetrove.data.database

import com.example.tastetrove.data.database.dao.RecipeDao
import com.example.tastetrove.data.database.entities.RecipeEntity
import com.example.tastetrove.data.network.RecipeService
import com.example.tastetrove.domain.model.Recipe
import com.example.tastetrove.domain.model.RecipeCategory
import com.example.tastetrove.domain.model.toDomain
import javax.inject.Inject

class RecipeRepository @Inject constructor(
    private val api: RecipeService,
    private val recipeDao: RecipeDao
) {

    suspend fun getAllRecipesFromApi(): List<Recipe>{
        val response = api.getRecipes()

        return response.map { it.toDomain() }
    }

    suspend fun getAllRecipesCategoriesFromApi(): List<RecipeCategory>{
        val response = api.getRecipesCategories()

        return response.map { it.toDomain() }
    }

    suspend fun getAllRecipesFromDatabase(): List<Recipe>{
        val response = recipeDao.getAllRecipes()
        return response.map { it.toDomain() }
    }

    suspend fun insertRecipes(recipes: List<RecipeEntity>){
        recipeDao.insertAll(recipes)
    }

    suspend fun cleanRecipes(){
        recipeDao.deleteAllRecipes()
    }
}