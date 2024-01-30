package com.example.tastetrove.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tastetrove.data.Recipe
import com.example.tastetrove.databinding.FragmentHomeBinding
import com.example.tastetrove.presentations.adapters.HomeFeaturedRecipesAdapter
import com.example.tastetrove.presentations.viewmodels.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: HomeViewModel
    private lateinit var homeFeaturedRecipesAdapter: HomeFeaturedRecipesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeFeaturedRecipesAdapter = HomeFeaturedRecipesAdapter(
            listOf(
                Recipe(
                    "Arroz con pollo",
                    "1",
                    "Preparar arroz con pollo es sencillo y delicioso. En una olla grande, sofríe pimientos, ajo y cebolla. Agrega arroz, agua, pollo, verduras y condimentos; cocina hasta que el arroz esté suave. Disfruta de este plato sabroso y nutritivo.",
                    "https://www.elespectador.com/resizer/31EbdSMLloiIOdtjK_woHmwSXBg=/920x613/filters:quality(60):format(jpeg)/cloudfront-us-east-1.images.arcpublishing.com/elespectador/LDRLW34JWNAPHDQ6I7KOOUJVKI.jpg",
                    "Arroz, pollo, pimientos, ajo y cebolla",
                    8.5,
                ),
            ),
        )

        binding.rvFeaturedRestaurants.apply {
            layoutManager = LinearLayoutManager(requireContext())
            layoutManager
            adapter = homeFeaturedRecipesAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}