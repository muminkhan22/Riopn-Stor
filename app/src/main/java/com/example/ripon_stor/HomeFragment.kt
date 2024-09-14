package com.example.ripon_stor

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ripon_stor.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binder: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binder = FragmentHomeBinding.inflate(layoutInflater, container, false)

        binder.visitShop.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_listFragment)
        }


        return binder.root
    }

}

