package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        * Para la funcion evalColores se crea una variable de tipo String que llevara la cadena a comparar dentro
        * de las sentencias en el metodo.
        */
        //EJERCICIO 1
        var color="azul";
        evalColores(color)
        /*
       * Para la funcion evalComida se crea una variable de tipo String que llevara la cadena a comparar dentro
       * de las sentencias en el metodo.
       */
        //EJERCICIO 2
        evalComida()

        //EJERCICIO 3
        contadores()
    }
    /*
     * Ejercicio sentencia IF ELSE /ELSE IF con los valores de los colores Amarillo, Rojo, Azul, Verde, Negro

    private fun evalColores(color: String){
        if(color=="Amarillo"){
            println(color)
        }else if(color=="Rojo"){
            println(color)
        }else if(color=="Azul"){
            println(color)
        }else if(color=="Verde"){
            println(color)
        }else if(color=="Negro"){
            println(color)
        }else{
            println("El color ingresado no se ha identificado")
        }
     */
    //EJERCICIO 1
    private fun evalColores(color: String){
        if(color=="Amarillo"||color=="Rojo"||color=="Azul"||color=="Verde"||color=="Negro"){
            println(color)
        }else{
            println("El color ingresado no se ha identificado")
        }
    }
    //EJERCICIO 2
    private fun evalComida(){
        var comida="Luca"
        when (comida) {
            "Pupusas","Atol dulce" ->{ println("Comida de El Salvador")}
            "Tacos","Chilaquilas" -> {println("Comida de México")}
            "Shucos","Fiambre" -> {println("Comida de Guatemala")}
            "Baleadas","Montucas" -> {println("Comida de Honduras")}
            "Gallo Pinto","Casado" -> {println("Comida de Costa Rica")}
            else-> println("Comida desconocida")
        }
    }

    //EJERCICIO 3
    private fun contadores(){
        for(x in 0..12){
            println(x)
        }
        println("************************************")
        for(x in 0..12 step 2){
            println(x)
        }
        println("************************************")
        for(x in 12 downTo 0){
            println(x)
        }
        println("************************************")
        for(x in 12 downTo 0 step 3){
            println(x)
        }
        println("************************************")
    }
}