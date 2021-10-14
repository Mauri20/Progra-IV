package com.clase1oct.lab2

abstract class Cocina(val receta:String) {
    abstract fun cocinar()

    protected fun saludoCocina(){
        println("Estoy en la clase abstracta Cocina")
    }
}