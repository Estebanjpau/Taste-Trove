package com.example.tastetrove.presentations.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tastetrove.domain.GetFeaturedRecipesUseCase
import com.example.tastetrove.domain.GetRecipesCategoryUseCase
import com.example.tastetrove.domain.GetRecipesUseCase
import com.example.tastetrove.domain.model.Recipe
import com.example.tastetrove.domain.model.RecipeCategory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase,
    private val getFeaturedRecipesUseCase: GetFeaturedRecipesUseCase,
    private val getRecipesCategoryUseCase: GetRecipesCategoryUseCase,
) : ViewModel() {

    val recipeModel = MutableLiveData<List<Recipe?>?>()
    val listRecipeCategoryModel = MutableLiveData<List<RecipeCategory>?>()
    private val isLoading = MutableLiveData<Boolean>()

    fun onCreated() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getRecipesUseCase()
            if (result.isNotEmpty()) {
                recipeModel.postValue(result)
                isLoading.postValue(false)
            }

            val categoriesResult = getRecipesCategoryUseCase()
            if (categoriesResult.isNotEmpty()) {
                listRecipeCategoryModel.postValue(categoriesResult)
                isLoading.postValue(false)
            }
        }
    }

    fun getFeaturedRecipe() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val recipe = getFeaturedRecipesUseCase()
            if (recipe != null) {
                recipeModel.postValue(recipe)
            }
            isLoading.postValue(false)
        }
    }
}