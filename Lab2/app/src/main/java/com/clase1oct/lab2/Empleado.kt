package com.clase1oct.lab2

class Empleado(nombre:String, apellido:String, edad:Int):Persona(nombre, apellido, edad){
    private var ocupacion:String="Trabajo en Jardineria"
    fun textoEmpleado(){
        textoPersona()
        println(ocupacion)
    }
}