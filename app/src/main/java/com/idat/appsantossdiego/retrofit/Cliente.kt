package com.idat.appsantossdiego.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Cliente {
    private fun builRetrofit()= Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val retrofitService: Service by lazy {
        builRetrofit().create(Service::class.java)
    }
}