package com.example.tastetrove.presentations.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.tastetrove.domain.model.RecipeCategory

class RecyclerDiffUtils(private val oldList: List<RecipeCategory>, private val newList: List<RecipeCategory>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].categoryId == newList[newItemPosition].categoryId
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}