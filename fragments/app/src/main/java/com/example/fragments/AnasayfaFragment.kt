package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragments.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)
        tasarim.buttonA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.aEkraninaGecis)
        }
        tasarim.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xEkraninaGecis)
        }
        return tasarim.root
    }
}