package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragments.databinding.FragmentSayfaABinding
import com.example.fragments.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaYBinding.inflate(inflater,container,false)
        tasarim.buttonGeri.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfaEkraninaGecis)
        }
        return tasarim.root
    }
}