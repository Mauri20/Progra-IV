package com.clase1oct.lab2

class Accion(receta:String):Cocina(receta) {
    override fun cocinar() {
        println("la receta que ha ingresado se procederá a realizar, verifique que sea la siguiente: $receta")
        saludoCocina()
    }

}