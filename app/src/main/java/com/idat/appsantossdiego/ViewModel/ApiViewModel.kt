package com.idat.appsantossdiego.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.idat.appsantossdiego.repository.ApiRepository
import com.idat.appsantossdiego.retrofit.response.ResponseApi

class ApiViewModel : ViewModel(){
    private var repositoru = ApiRepository()

    fun cargarApi():LiveData<List<ResponseApi>>{
        return repositoru.listaApi()
    }
}