package com.example.tastetrove.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.tastetrove.domain.model.RecipeCategory

@Entity(tableName = "recipe_category_table")
class RecipeCategoryEntity (
    @PrimaryKey
    @ColumnInfo(name = "CategoryId") val categoryId: String,
    @ColumnInfo(name = "categoryName") val categoryName: String,
    @ColumnInfo(name = "categoryImage") val categoryImage: String,
    @ColumnInfo(name = "categoryDescription") val categoryDescription: String,
)

fun RecipeCategory.toDatabase() = RecipeCategoryEntity(
    categoryId = categoryId,
    categoryName = categoryName,
    categoryDescription = categoryDescription,
    categoryImage = categoryImage,
)