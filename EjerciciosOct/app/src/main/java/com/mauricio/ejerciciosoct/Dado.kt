package com.mauricio.ejerciciosoct

class Dado(var numero:Int) {
    var numeroX=0
    fun aleatorio(){
        if(numero>=1 && numero<=6){
            numeroX = numero
        }else{
            numeroX=1
        }
        println("Dado cargado con el numero :$numeroX")

        var numeroY=(1..100).random()

        println("El numero aleatorio generado es: $numeroY")
    }
}