package com.example.tastetrove.domain

import com.example.tastetrove.data.database.RecipeRepository
import com.example.tastetrove.domain.model.Recipe
import com.example.tastetrove.domain.model.RecipeCategory
import javax.inject.Inject

class GetRecipesCategoryUseCase @Inject constructor(private val repository: RecipeRepository) {
    suspend operator fun invoke(): List<RecipeCategory> {
        return repository.getAllRecipesCategoriesFromApi()
    }
}