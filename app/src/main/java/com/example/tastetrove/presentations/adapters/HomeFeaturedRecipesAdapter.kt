package com.example.tastetrove.presentations.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.tastetrove.R
import com.example.tastetrove.domain.model.RecipeCategory
import com.example.tastetrove.presentations.utils.RecyclerDiffUtils
import com.example.tastetrove.presentations.viewholders.HomeFeaturedRecipesViewHolder

class HomeFeaturedRecipesAdapter(private var list: List<RecipeCategory>) : RecyclerView.Adapter<HomeFeaturedRecipesViewHolder>() {

    fun updateList(newList: List<RecipeCategory>){
        val recipeDiff = RecyclerDiffUtils(list, newList)
        val result = DiffUtil.calculateDiff(recipeDiff)
        list = newList
        result.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFeaturedRecipesViewHolder {
        return HomeFeaturedRecipesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_feature_recipes_rv_home, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: HomeFeaturedRecipesViewHolder, position: Int) {
        holder.paint(list[position])
    }
}