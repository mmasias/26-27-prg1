## Predicción

Si el cliente entrega una cantidad menor que el importe a pagar, entonces:

Debido al codigo del programa,
donde no se comprueba que la cantidad a pagar debe ser siempre mayor al importe a pagar.

Estas cantidades seran aceptadas como input, ejemplo:
```
System.out.print("¿Cuántos euros debe pagar?");
int costoDeCompra = scanner.nextInt(232);

System.out.println("¿Con cuántos euros paga?");
int pagoDeCompra = scanner.nextInt(200);

int cambioDeCompra = pagoDeCompra - costoDeCompra;
```
Al obtener los valores de las cantidades que se devolveran al cliente de cada tipo de billete y moneda, se asignaran numeros negativos a estos a causa de que el cambioDeCompra (valor que se opera para obtener dichas cantidades) es negativo.

Ejemplo: 

0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €

## Resultados 

La prediccion fue acertada, las operaciones utilizadas en los calculos de los valores no tuvo mayor complicación. Tanto "/" y "%" admiten numeros negativos, no existe incompatibilidad en los tipos de datos utilizados en las operaciones y asignacion de valores por lo que la ejecución del programa siguio su curso hasta terminar.

