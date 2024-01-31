package com.example.tastetrove.domain

import com.example.tastetrove.data.database.RecipeRepository
import com.example.tastetrove.domain.model.Recipe
import javax.inject.Inject

class GetFeaturedRecipesUseCase @Inject constructor(private val repository: RecipeRepository){

    suspend operator fun invoke(): List<Recipe>? {
        val recipes = repository.getAllRecipesFromDatabase()
        if(recipes.isNotEmpty()){
            return recipes
        }
        return null
    }
}