package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragments.databinding.FragmentSayfaABinding
import com.example.fragments.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim =  FragmentSayfaXBinding.inflate(inflater, container, false)
        tasarim.buttonY2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yEkraninaGecisXten)
        }
        return tasarim.root
    }

}