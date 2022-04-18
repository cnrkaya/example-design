package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragments.databinding.FragmentSayfaABinding
import com.example.fragments.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)
        tasarim.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yEkraninaGecisBden)
        }
        return tasarim.root
    }

}