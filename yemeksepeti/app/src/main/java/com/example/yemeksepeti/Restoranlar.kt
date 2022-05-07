package com.example.yemeksepeti

import java.io.Serializable

class Restoranlar(
    var restoranId: Int,
    var resimAdi: String,
    var restoranAdi: String,
    var restoranDetay: String,
    var restoranPuan: Double,
    var restoranKampanyaOrani: Int,
    var restoranMinFiyat: Double,
    var restoranGetirmeSuresi: String,
    var restoranTasimaUcreti: Double,
    var kampanyaKola: Boolean,
    var kampanyaMaximum: Boolean,
    var kampanyaAlgida: Boolean
) : Serializable {
}