package com.example.todoapp.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentDetayBinding
import com.example.todoapp.vievmodel.DetayFragmentViewModel
import com.example.todoapp.vievmodel.DetayVMF

class DetayFragment : Fragment() {
    private lateinit var tasarim:FragmentDetayBinding
    private lateinit var viewModel: DetayFragmentViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)
        tasarim.yapilacakDetayFragment = this
        tasarim.toolbarYapilacakDetay.title = "Yapilacak Detay"

        val bundle:DetayFragmentArgs by navArgs()
        val gelenYapilacak= bundle.yapilacak
        tasarim.yapilacaklarNesnesi = gelenYapilacak

        return tasarim.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:DetayFragmentViewModel by viewModels(){
            DetayVMF(requireActivity().application)
        }
        viewModel = tempViewModel
    }

    fun buttonGuncelle(isId:Int,yapilacakIs:String,){
        viewModel.guncelle(isId,yapilacakIs)
    }

}