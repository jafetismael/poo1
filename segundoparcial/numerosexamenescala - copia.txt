var numnegativos = 0
var numneutros = 0
for (x <- 1 to 20){
 println("Escriba un número")
 numero = readFloat()
 if (numero > 0){
  numpositivos += 1
  } else if (numero < 0){
  numnegativos +=1
  } else {
  numneutros += 1
  }
  }
  println ("La cantidad de números neutros existente es:" + numneutros)
  println ("La cantidad de números negativos existente es:" + numnegativos)
 }
}
println("Existira algun universo paralelo el cual no produzca dolor alguno")