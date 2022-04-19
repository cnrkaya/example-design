package com.example.simple_calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simple_calculator.databinding.ActivityMainBinding
import java.util.Stack

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val stack = Stack<String>();
        tasarim  =ActivityMainBinding.inflate(layoutInflater)
        tasarim.button1.setOnClickListener {
            stack.push("1")
        }
        tasarim.button2.setOnClickListener {
            stack.push("2")
        }
        tasarim.button3.setOnClickListener {
            stack.push("3")
        }
        tasarim.button4.setOnClickListener {
            stack.push("4")
        }
        tasarim.button5.setOnClickListener {
            stack.push("5")
        }
        tasarim.button6.setOnClickListener {
            stack.push("6")
        }
        tasarim.button7.setOnClickListener {
            stack.push("7")
        }
        tasarim.button8.setOnClickListener {
            stack.push("8")
        }
        tasarim.button9.setOnClickListener {
            stack.push("9")
        }
        tasarim.button0.setOnClickListener {
            stack.push("0")
        }
        tasarim.buttonTemizle.setOnClickListener {
            tasarim.textViewSonuc.text = "0"
        }
        tasarim.buttonTopla.setOnClickListener {
            stack.push("+")
        }
        tasarim.buttonEsittir.setOnClickListener {
            hesapla(stack)
        }
        setContentView(tasarim.root)

    }

    fun hesapla(stack:Stack<String>){
        val sayilar = ArrayList<Int>()
        var tmpSayi = 0
        var basamak = 1
        while (!stack.empty()){
            var deger = stack.pop()
            if(deger == "+"){
                //sayıyı diziye at
                sayilar.add(tmpSayi)
                tmpSayi = 0
                basamak = 1
            }else{
                //rakamı sayıya dönüştür
                tmpSayi += deger.toInt() * basamak
                basamak *= 10
            }
        }
        //son sayıyı diziye at
        sayilar.add(tmpSayi)
        //diziye atılan sayıları topla
        var toplam = 0
        for(sayi in sayilar){
            toplam += sayi
        }

        tasarim.textViewSonuc.text = toplam.toString()
    }

}