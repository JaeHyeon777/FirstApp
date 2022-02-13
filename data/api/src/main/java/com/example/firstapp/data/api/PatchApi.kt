package com.example.firstapp.data.api

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface PatchApi {
    @GET("api/versions.json")
    suspend fun getPatchVersionData(): Response<ResponseBody>
}