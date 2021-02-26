package com.createsapp.retrofittutorialinkotlin.repository

import com.createsapp.retrofittutorialinkotlin.api.RetrofitInstance
import com.createsapp.retrofittutorialinkotlin.model.Post

class Repository {
    suspend fun getPost(): Post{
       return RetrofitInstance.api.getPost()
    }
}