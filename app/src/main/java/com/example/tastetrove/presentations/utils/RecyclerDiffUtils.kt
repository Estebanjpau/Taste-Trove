package com.example.tastetrove.presentations.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.tastetrove.data.Recipe

class RecyclerDiffUtils(private val oldList: List<Recipe>, private val newList: List<Recipe>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}