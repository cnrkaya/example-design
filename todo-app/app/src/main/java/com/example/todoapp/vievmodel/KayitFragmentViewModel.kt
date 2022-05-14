package com.example.todoapp.vievmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.todoapp.repo.YapilacaklarDaoRepository

class KayitFragmentViewModel(application: Application) : AndroidViewModel(application) {
    val yrepo = YapilacaklarDaoRepository(application)

    fun kayit(yapilacakIs:String){
        yrepo.yapilacakKayit(yapilacakIs)
    }
}