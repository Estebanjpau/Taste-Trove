package com.example.tastetrove.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe_table")
data class RecipeEntitie(
    @PrimaryKey @ColumnInfo( name = "id") val id: String,
    @ColumnInfo( name = "name") val name: String,
    @ColumnInfo( name = "instructions") val instructions: String,
    @ColumnInfo( name = "image") val image: String,
    @ColumnInfo( name = "ingredient1") val ingredient1: String,
    @ColumnInfo( name = "ingredient2") val ingredient2: String,
    @ColumnInfo( name = "ingredient3") val ingredient3: String,
    @ColumnInfo( name = "ingredient4") val ingredient4: String,
    @ColumnInfo( name = "ingredient5") val ingredient5: String,
    @ColumnInfo( name = "ingredient6") val ingredient6: String,
    @ColumnInfo( name = "ingredient7") val ingredient7: String,
    @ColumnInfo( name = "ingredient8") val ingredient8: String,
    @ColumnInfo( name = "ingredient9") val ingredient9: String,
    @ColumnInfo( name = "ingredient10") val ingredient10: String,
    @ColumnInfo( name = "ingredient11") val ingredient11: String,
    @ColumnInfo( name = "ingredient12") val ingredient12: String,
    @ColumnInfo( name = "ingredient13") val ingredient13: String,
    @ColumnInfo( name = "ingredient14") val ingredient14: String,
    @ColumnInfo( name = "ingredient15") val ingredient15: String,
    @ColumnInfo( name = "review") val review: Int = 0,
)