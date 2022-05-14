package com.example.todoapp.vievmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todoapp.entity.Yapilacaklar
import com.example.todoapp.repo.YapilacaklarDaoRepository

class AnasayfaFragmentViewModel(application: Application) : AndroidViewModel(application){
    val yrepo = YapilacaklarDaoRepository(application)
    var yapilacaklarListesi = MutableLiveData<List<Yapilacaklar>>()

    init {
        yapilacaklarYukle()
        yapilacaklarListesi = yrepo.yapilacaklarGetir()
    }

    fun ara(aramaKelimesi:String){
        yrepo.yapilacakAra(aramaKelimesi)
    }

    fun sil(isId:Int){
        yrepo.yapilacakSil(isId)
    }

    fun yapilacaklarYukle(){
        yrepo.tumyapilacakleriAl()
    }
}