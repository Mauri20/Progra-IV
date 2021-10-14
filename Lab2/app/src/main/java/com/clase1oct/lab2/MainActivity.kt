package com.clase1oct.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //HERENCIA
        var emp=Empleado("Mauricio", "Rosa", 25)
        emp.textoEmpleado()
        //INTERFACE
        var rect=Rectangulo(5,4)
        rect.area()
        //ABSTRACCION
        var accion=Accion("Cortar el tomate")
        accion.cocinar()
    }
}