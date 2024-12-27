package com.idat.appsantossdiego.view.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.idat.appsantossdiego.retrofit.response.ResponseApi
import pe.edu.idat.apppatitas2024.databinding.ItemApiBinding
import java.util.Calendar

class ApiAdapter(private var cargaApi: List<ResponseApi>) : RecyclerView.Adapter<ApiAdapter.ApiViewHolder>(){

    inner class ApiViewHolder(val binding: ItemApiBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiAdapter.ApiViewHolder {
        val binding = ItemApiBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ApiViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ApiAdapter.ApiViewHolder, position: Int) {
        with(holder){
            with(cargaApi[position]){
                binding.userID.text.toString().toInt() = userId
                binding.id.text.toString().to = id
                binding.txttitle.text = title
                binding.txtBody.text = body
            }
        }
    }

    override fun getItemCount() = cargaApi.size
}