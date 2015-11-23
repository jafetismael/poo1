val calificacion = 0.0
val menorcalif = 11
for (x <- 1 to 40){
println("Ingrese su calificación")
calificacion = readFloat()
if (calificacion < menorcalif){
menorcalif = calificacion } }
println ("La calificación menor es:" + menorcalif)