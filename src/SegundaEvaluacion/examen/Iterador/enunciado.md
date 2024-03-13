# EJERCICIO 1

Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca el valor -99. 

Este valor no se guarda en el ArrayList. A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su media. 

Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.

Para resolverlo vamos a utilizar 3 métodos además del método main:
Método leerValores(): pide por teclado los números enteros y los almacena en el ArrayList. La lectura acaba cuando se introduce el valor -99. El método devuelve mediante return el ArrayList con los valores introducidos.
Método calcularSuma(): Recibe como parámetro el ArrayList con los valores numéricos y calcula y devuelve su suma. En este método se utiliza un Iterator para recorrer el ArrayList.
Método mostrarResultados(): Recibe como parámetro el ArrayList, la suma y la media aritmética. Muestra por pantalla todos los valores, su suma y su media y calcula y muestra cuantos números son superiores a la media. En este método se utiliza un for para colecciones para recorrer el ArrayList.
