package com.idat.appsantossdiego.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.idat.appsantossdiego.retrofit.Cliente
import com.idat.appsantossdiego.retrofit.response.ResponseApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiRepository {
    private val responseApi = MutableLiveData<List<ResponseApi>>()

    fun listaApi(): MutableLiveData<List<ResponseApi>>{
        val call : Call<List<ResponseApi>> = Cliente.retrofitService.listarApi()
        call.enqueue(object : Callback<List<ResponseApi>> {
            override fun onResponse(
                call: Call<List<ResponseApi>>,
                response: Response<List<ResponseApi>>
            ) {
                if (response.isSuccessful) {
                    responseApi.postValue(response.body()?: emptyList())
                }else{
                    Log.e("ERROR API", "Error código: ${response.code()}")
                    responseApi.postValue(emptyList())
                }
            }

            override fun onFailure(call: Call<List<ResponseApi>>, t: Throwable) {
                Log.e("ERROR API",
                    "ERROR")
            }
        })
        return  responseApi
    }
}