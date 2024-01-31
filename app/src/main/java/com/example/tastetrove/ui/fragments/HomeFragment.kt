package com.example.tastetrove.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tastetrove.databinding.FragmentHomeBinding
import com.example.tastetrove.presentations.adapters.HomeFeaturedRecipesAdapter
import com.example.tastetrove.presentations.viewmodels.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeViewModel by viewModels()
    private lateinit var vmRecipesCategoriesAdapter : HomeFeaturedRecipesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.onCreated()

        vmRecipesCategoriesAdapter = HomeFeaturedRecipesAdapter(emptyList())

        binding.rvFeaturedRestaurants.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = vmRecipesCategoriesAdapter
        }

        viewModel.listRecipeCategoryModel.observe(viewLifecycleOwner, Observer {
            vmRecipesCategoriesAdapter.updateList(it ?: emptyList())
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}