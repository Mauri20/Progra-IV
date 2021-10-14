package com.clase1oct.lab2

open class Persona (val nombre:String, val apellido:String, val edad:Int) {
    fun textoPersona(){
        println("Mi nombre es $nombre $apellido y tengo $edad años")
    }
}