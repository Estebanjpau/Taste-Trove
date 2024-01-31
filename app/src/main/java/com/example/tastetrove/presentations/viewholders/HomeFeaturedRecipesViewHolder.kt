package com.example.tastetrove.presentations.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tastetrove.data.models.RecipeModel
import com.example.tastetrove.databinding.ItemFeatureRecipesRvHomeBinding
import com.example.tastetrove.domain.model.RecipeCategory

class HomeFeaturedRecipesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemFeatureRecipesRvHomeBinding.bind(view)

    fun paint(recipe: RecipeCategory){
        binding.tvReviewFeaturedRecipes.text = "8.5"
        binding.tvNameRecipe.text = recipe.categoryName
        binding.tvPopIngredients.text = recipe.categoryDescription
        Glide.with(binding.ivFeatureRecipe.context).load(recipe.categoryImage).into(binding.ivFeatureRecipe)
    }

}