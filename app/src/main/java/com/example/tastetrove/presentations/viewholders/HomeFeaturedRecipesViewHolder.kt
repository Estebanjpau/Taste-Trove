package com.example.tastetrove.presentations.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tastetrove.data.Recipe
import com.example.tastetrove.databinding.ItemFeatureRecipesRvHomeBinding

class HomeFeaturedRecipesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemFeatureRecipesRvHomeBinding.bind(view)

    fun paint(recipe: Recipe){
        binding.tvReviewFeaturedRecipes.text = recipe.review.toString()
        binding.tvNameRecipe.text = recipe.name
        binding.tvPopIngredients.text = recipe.ingredients
        Glide.with(binding.ivFeatureRecipe.context).load(recipe.image).into(binding.ivFeatureRecipe)
    }

}