package com.example.tastetrove.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tastetrove.data.database.dao.RecipeDao
import com.example.tastetrove.data.database.entities.RecipeEntitie

@Database(entities = [RecipeEntitie::class], version = 1, exportSchema = false)
abstract class RecipeDatabase: RoomDatabase() {

    abstract fun getRecipeDao(): RecipeDao
}