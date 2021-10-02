package com.mauricio.ejerciciosoct

class Empleado (var nombre:String, var sueldo:Double, var area:String, var cargo:String, var tiempo:Int){
    fun pisto(){
        if(sueldo<=0){
            println("El sueldo indicado es 0 o menor, NO ES VALIDO!")
        }else if(area.isEmpty() || cargo.isEmpty()){
            println("Debe ingresar un valor para El Area y el Cargo")
        }else{
            var sueldoExtra=25*evaluar()
            var sueldoTotal=sueldo+sueldoExtra
            println("Empleado: $nombre, sueldo base: $sueldo, tiempo trabajado: $tiempo, remuneracion por tiempo: $sueldoExtra, sueldo final: $sueldoTotal")
        }
    }

    fun evaluar(): Int{
        var aumento=0

        aumento=tiempo/5

        return aumento
    }
}