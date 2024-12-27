package com.idat.appsantossdiego.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.idat.appsantossdiego.ViewModel.ApiViewModel
import pe.edu.idat.apppatitas2024.R
import pe.edu.idat.apppatitas2024.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private var _binding : FragmentListBinding ? = null

    private val binding get() = _binding!!

    private lateinit var apiViewModel: ApiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(
            inflater, container, false
        )

        binding.rvApi.layoutManager = LinearLayoutManager(requireActivity())

        apiViewModel = ViewModelProvider(requireActivity()).get(ApiViewModel::class.java)

        apiViewModel.cargarApi().observe(viewLifecycleOwner, Observer {
            response -> binding.rvApi.adapter =
        })

        return inflater.inflate(R.layout.fragment_list, container, false)
    }

}