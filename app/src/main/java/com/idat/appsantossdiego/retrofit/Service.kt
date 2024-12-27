package com.idat.appsantossdiego.retrofit

import com.idat.appsantossdiego.retrofit.response.ResponseApi
import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("posts")
    fun listarApi():
            Call<List<ResponseApi>>
}