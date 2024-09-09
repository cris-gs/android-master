package com.badgerdev.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/1115772879458425/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName:String):Response<SuperHeroDataResponse>

    @GET("/api/1115772879458425/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperheroDetailResponse>

}