var kg=0.0
var compracliente=0.0
var total=0.0

println("Precio del kilo de naranja")
val preciokg= readFloat()

ffor (i<- to 15){
println("¿Cuántos kilogramos se compraron?")
kg = readFloat()
compracliente= preciokg * kg
if (kg > 10 ){
compracliente = compracliente *.15%
}
total += compracliente
println("El total de su compra es: " +compracliente)
}
println("La ganancia de la tienda será:" + total) 
}
println("La historia de un unico fenix negro")