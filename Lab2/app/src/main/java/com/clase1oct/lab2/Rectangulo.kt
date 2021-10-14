package com.clase1oct.lab2

class Rectangulo(var largo:Int, var ancho:Int) :Forma{
    override fun area() {
        println("El area del rectangulo es de "+largo*ancho)
    }
}