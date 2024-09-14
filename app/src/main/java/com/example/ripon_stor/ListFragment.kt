package com.example.ripon_stor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ripon_stor.databinding.FragmentListBinding


class ListFragment : Fragment() {
    lateinit var binding: FragmentListBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentListBinding.inflate(layoutInflater,container,false)
        binding.tee.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_teFragment)
        }

        binding.arche.setOnClickListener {

            findNavController().navigate(R.id.action_listFragment_to_archeFragment)
        }
        binding.aser.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_aserFragment)
        }
        binding.chaps.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_chapsFragment)

        }
        binding.dal.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_dalFragment)
        }
        binding.mosla.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_moslaFragment)
        }
        binding.suger.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_sugerFragment)
        }

        return binding.root


    }

}

