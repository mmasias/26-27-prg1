## Mi predicción:
Sin haberlo visto en la terminal, creo que si el cliente entrega 200€ para pagar una compra de 232€, en la línea 14 del código, donde el programa calcula la cantidad de dinero a devolver dará como resultado un número negativo (200-232=-32), produciendo un arrastre de ese valor negativo a los siguientes cálculos.
Las operaciones que no devuelven 0 como resultado son: en la línea 26 -32/20, en la 28 -12/10 y en la 32 -2/2, que al imprimirlo en un mensaje en la terminal dirá que hay que devolver -1 billetes de 20€, -1 billetes de 10€ y -1 moneda de 2€.

## Resultado en la terminal:
La terminal ha impreso lo supuesto en la predicción, siguiendo la lógica matemática del programa explicada arriba.