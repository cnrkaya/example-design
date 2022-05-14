package com.example.todoapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentKayitBinding
import com.example.todoapp.vievmodel.KayitFragmentViewModel
import com.example.todoapp.vievmodel.KayitVMF

class KayitFragment : Fragment() {
    private lateinit var tasarim:FragmentKayitBinding
    private lateinit var viewModel:KayitFragmentViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_kayit, container, false)
        tasarim.kayitFragment = this
        tasarim.toolbarYapilacakKayit.title = "Yapılacak Kayıt"

        return tasarim.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:KayitFragmentViewModel by viewModels(){
            KayitVMF(requireActivity().application)
        }
        viewModel = tempViewModel
    }
    fun buttonKayit(yapilacakIs:String){
        viewModel.kayit(yapilacakIs)
    }
}