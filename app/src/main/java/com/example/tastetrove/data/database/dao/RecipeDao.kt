package com.example.tastetrove.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tastetrove.data.database.entities.RecipeEntitie

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe_table ORDER BY name DESC")
    suspend fun getAllRecipes():List<RecipeEntitie>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(recipes:List<RecipeEntitie>)
}