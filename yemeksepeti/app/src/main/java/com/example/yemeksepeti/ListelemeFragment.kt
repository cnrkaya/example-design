package com.example.yemeksepeti

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yemeksepeti.databinding.FragmentListelemeBinding

class ListelemeFragment : Fragment() {
    private lateinit var tasarim: FragmentListelemeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentListelemeBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager = LinearLayoutManager(requireContext())

        val restoranListesi = ArrayList<Restoranlar>()
        val r1 = Restoranlar(1, "dondurmamia", "Dondurmamia", "Dondurma - Beşiktaş (Etiler Mah.)", 8.7,50,45.00,"20 - 30",0.00,false,false,true)
        val r2 = Restoranlar(2, "dominospizza", "Domino's Pizza", "Domino's Pizza - Kağıthane (Talatpaşa Mah.)", 8.8,35,24.99,"20 - 30",0.00,true,true,true)
        val r3 = Restoranlar(3, "tahirusta", "Tahir Usta Kebapçısı", "Kebap & Türk Mutfağı - Şişli (Mecidiyeköy...)", 9.1,35,100.00,"20 - 30",0.00,true,false,false)
        val r4 = Restoranlar(4, "simgekasapburger", "Simge Kasap Burger", "Burger - Sarıyer (Reşitpaşa Mah.)", 9.0,50,200.00,"20 - 30",0.00,false,true,false)
        val r5 = Restoranlar(5, "unkapanipilavcisi", "Meşhur Unkapani Pilavcısı", "Pilava - Kağıthane (Çeliktepe Mah.)", 9.0,35,55.00,"20 - 30",0.00,false,false,false)
        val r6 = Restoranlar(6, "restoran", "Sevinç Pastanesi", "Pasta Börek Poğaça - Maltepe", 9.7,35,45.00,"20 - 30",0.00,true,true,false)
        restoranListesi.add(r1)
        restoranListesi.add(r2)
        restoranListesi.add(r3)
        restoranListesi.add(r4)
        restoranListesi.add(r5)
        restoranListesi.add(r6)
        val adapter = RestoranlarAdapter(requireContext(), restoranListesi)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }


}