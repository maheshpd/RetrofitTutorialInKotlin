package com.createsapp.retrofittutorialinkotlin.api

import com.createsapp.retrofittutorialinkotlin.model.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Post
}