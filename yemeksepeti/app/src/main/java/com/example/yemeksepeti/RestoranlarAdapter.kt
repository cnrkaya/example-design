package com.example.yemeksepeti

import android.content.Context
import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yemeksepeti.databinding.CardTasarimBinding

class RestoranlarAdapter(var mContext: Context, var restoranlarListesi: List<Restoranlar>) :
    RecyclerView.Adapter<RestoranlarAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: CardTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val restoran = restoranlarListesi.get(position)
        val t = holder.tasarim

        t.imageViewRestoranResim.setImageResource(mContext.resources.getIdentifier(restoran.resimAdi,"drawable",mContext.packageName))
        t.textViewRestoranAdi.text = restoran.restoranAdi
        t.textViewRestoranDetay.text = restoran.restoranDetay
        t.textViewRestoranPuan.text = restoran.restoranPuan.toString()
        t.textViewKampanyaOrani.text = "%"+restoran.restoranKampanyaOrani.toString()
        t.textViewMinFiyat.text = restoran.restoranMinFiyat.toString() + "TL"
        t.textViewGetirmeSuresi.text = restoran.restoranGetirmeSuresi + " dk"
        t.textViewTasimaUcreti.text = restoran.restoranTasimaUcreti.toString() +" TL"
        t.imageViewCoke.visibility = if (restoran.kampanyaKola) { View.VISIBLE} else { View.GONE }
        t.imageViewX.visibility = if (restoran.kampanyaMaximum) { View.VISIBLE} else { View.GONE }
        t.imageViewAlgida.visibility = if (restoran.kampanyaAlgida) { View.VISIBLE} else { View.GONE }

    }

    override fun getItemCount(): Int {
        return restoranlarListesi.size
    }
}