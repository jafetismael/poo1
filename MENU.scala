println("Teclea el Numero del ejercicio que quieras realizar")
println("1)Ejercicio ")
println("2)Ejercicio ")
println("3)Ejercicio ")

def Ejercicio_1() {

println ("Primera Calificacion")
val calificacion1=readFloat()

println("Segunda Calificacion")
val calificacion2=readFloat()

println ("Tercera Calificacion")
val calificacion3=readFloat()

println ("Examen Final")
val ExamenFinal=readFloat()

println ("Trabajo  FInal")
val TrabajoFinal=readFloat ()

val Promedio=(calificacion1+calificacion2+calificacion3)/3
val Final=(Promedio*.55+ExamenFinal*.3+TrabajoFinal*.15)


println ("Calificacion "+ Final) 


}

def Ejercicio_2() {

	println ("Dame el presupues total")
val PresupuestoTotalAnual=readFloat()

val DineroGinecologia=(PresupuestoTotalAnual*.40)
val DineroTraumatologia=(PresupuestoTotalAnual*.30)
val DineroPediatria=(PresupuestoTotalAnual*.30)
println  ("el presupuesto de ginecologia es " + DineroGinecologia)
println  ("el presupuesto de traumatologia es " + DineroTraumatologia)
println  ("el presupuesto de pediatria es " + DineroPediatria)
}

def Ejercicio_3() {

	println ("cantidad 1")
val cantidad1=readFloat()
println ("cantidad 2")
val cantidad2=readFloat()
println ("cantidad 3")
val cantidad3=readFloat()
 
 val total= cantidad1 + cantidad2 + cantidad3
 val porcentaje1= cantidad1*100/total
 println("primer porcentaje " + porcentaje1)
 val porcentaje2= cantidad2*100/total
 println("segundo porcentaje " + porcentaje2)
 val porcentaje3=cantidad3*100/total 
 println ("tercer porcentaje " + porcentaje3)
}

val opcion=readInt()
opcion match {

case 1=> Ejercicio_1
case 2=> Ejercicio_2
case 3=> Ejercicio_3
case default => println ("Opcion Invalida!")

}


