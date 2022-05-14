package com.example.todoapp.repo

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.todoapp.entity.Yapilacaklar
import com.example.todoapp.room.Veritabani
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class YapilacaklarDaoRepository(var application: Application) {
    var yapilacaklarListesi: MutableLiveData<List<Yapilacaklar>>
    var vt: Veritabani

    init {
        yapilacaklarListesi = MutableLiveData()
        vt = Veritabani.veritabaniErisim(application)!!
    }

    fun yapilacaklarGetir(): MutableLiveData<List<Yapilacaklar>> {
        return yapilacaklarListesi
    }

    fun yapilacakKayit(yapilacakIs: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val yeniYapilacak = Yapilacaklar(0, yapilacakIs)
            vt.yapilacaklarDao().yapilacakEkle(yeniYapilacak)
        }
    }

    fun yapilacakGuncelle(isId: Int, yapilacakIs: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val guncellenenYapilacak = Yapilacaklar(isId, yapilacakIs)
          vt.yapilacaklarDao().yapilacakGuncelle(guncellenenYapilacak)
        }
    }

    fun yapilacakAra(aramaKelimesi: String) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            yapilacaklarListesi.value = vt.yapilacaklarDao().yapilacakArama(aramaKelimesi)
        }
    }

    fun yapilacakSil(isId: Int) {
        val job = CoroutineScope(Dispatchers.Main).launch {
            val silinenapilacak = Yapilacaklar(isId, "")
            vt.yapilacaklarDao().yapilacakSil(silinenapilacak)
            tumyapilacakleriAl()
        }
    }

    fun tumyapilacakleriAl() {
        val job = CoroutineScope(Dispatchers.Main).launch {
            yapilacaklarListesi.value = vt.yapilacaklarDao().tumYapilacaklar()
        }
    }
}