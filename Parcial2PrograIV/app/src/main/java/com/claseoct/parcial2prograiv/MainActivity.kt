package com.claseoct.parcial2prograiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etShow:TextView
    private lateinit var lvMascotas:ListView

    private val names= arrayOf("Rex","Cori","Killer","Micho")
    private val species= arrayOf("Perro","Perro","Perro","Gato")
    private val color= arrayOf("Marrón","Naranja","Negro","Negro con Blanco")
    private val gender= arrayOf("Masculino","Femenino","Masculino","Masculino")
    private val weight= arrayOf("20 Kg","2 Kg","15 Kg","1 Kg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etShow=findViewById(R.id.tvTexto)
        lvMascotas=findViewById(R.id.lv_Mascotas)

        val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        lvMascotas.adapter=adapter

        lvMascotas.setOnItemClickListener{
                adapterView, view, i, l->
            etShow.setText("Nombre: ${lvMascotas.getItemAtPosition(i)}, Especie: ${species[i]}, Color: ${color[i]}, Sexo: ${gender[i]}, Peso: ${weight[i]}")
        }


    }

}