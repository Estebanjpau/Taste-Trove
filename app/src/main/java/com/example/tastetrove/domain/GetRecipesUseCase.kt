package com.example.tastetrove.domain

import com.example.tastetrove.data.database.RecipeRepository
import com.example.tastetrove.data.database.entities.toDatabase
import com.example.tastetrove.domain.model.Recipe
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor( private val repository: RecipeRepository) {
    suspend operator fun invoke(): List<Recipe> {
        val quotes = repository.getAllRecipesFromApi()

        return if (quotes.isNotEmpty()){
            repository.cleanRecipes()
            repository.insertRecipes(quotes.map { it.toDatabase() })
            quotes
        } else {
            return repository.getAllRecipesFromDatabase()
        }
    }
}