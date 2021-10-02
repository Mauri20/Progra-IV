package com.mauricio.ejerciciosoct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        salario("Andres", 10.5, 50, 10)
        tablaMul(7)
        Empleado("Mauricio", 500.0, "Administracion","Masiso",15).pisto()
        Dado(3).aleatorio()
    }
    //EJERCICIO #1
    fun salario(nombre:String, pHora:Double, cantHoras:Int, hExtra:Int){
        var sueldoBase=pHora*cantHoras
        var sueldoExtra=hExtra*pHora*2

        var sueldoTotal=sueldoBase+sueldoExtra

        println("El nombre del Operario es $nombre y su sueldo devengado este mes es de $sueldoBase ademas su salario por horas extra es " +
                "de $sueldoExtra, por lo tanto su sueldo Total es de $sueldoTotal")
    }

    //EJERCICIO #2
    fun tablaMul(numero:Int){
        val valor=10

        var operacion=0
        println("Tabla de multiplicar del $numero")
        for (i in 1..valor){
            operacion=numero*i
            println("$numero x $i = $operacion")
        }
    }

}