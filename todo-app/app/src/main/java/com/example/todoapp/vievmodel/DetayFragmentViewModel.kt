package com.example.todoapp.vievmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.todoapp.repo.YapilacaklarDaoRepository

class DetayFragmentViewModel(application: Application) : AndroidViewModel(application) {
    val yrepo = YapilacaklarDaoRepository(application)

    fun guncelle(isId:Int,yapilacakIs:String){
        yrepo.yapilacakGuncelle(isId,yapilacakIs)
    }
}