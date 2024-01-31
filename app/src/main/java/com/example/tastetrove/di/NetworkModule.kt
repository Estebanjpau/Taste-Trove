package com.example.tastetrove.di

import com.example.tastetrove.data.network.RecipeAPI
import com.example.tastetrove.data.network.RecipeCategoryAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideRecipeAPI(retrofit: Retrofit): RecipeAPI {
        return retrofit.create(RecipeAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideRecipeCategoriesAPI(retrofit: Retrofit): RecipeCategoryAPI {
        return retrofit.create(RecipeCategoryAPI::class.java)
    }
}