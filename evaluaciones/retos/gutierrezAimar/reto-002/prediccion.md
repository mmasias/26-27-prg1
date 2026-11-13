# Reto 002 – Reto extendido: predicción

**Caso:** el cliente debe pagar 232 € y entrega 200 €
## Predicción (antes de ejecutar)

El programa no comprueba nada, así que calculará `resto = 200 - 232 = -32` y seguirá dividiendo.
En Java la división entera trunca hacia cero y `%` conserva el signo del dividendo, por lo que
creo que saldrá algo así:

```
0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €
```

Es decir, cantidades negativas: -20 - 10 - 2 = -32.

## Resultado real

Al ejecutar el programa con 232 € a pagar y 200 € entregados, la salida fue:

0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €

Mi predicción fue correcta.

## Explicación

El programa calcula el cambio como 200 - 232 = -32 y no comprueba que lo entregado sea menor que el importe, porque la condición del enunciado dice que eso nunca ocurre y yo no puedo usar `if`.

En Java, la división entera redondea hacia cero y el resto (%) conserva el signo del número que se divide. Por eso, con -32:

- -32 / 20 = -1, y sobran -12
- -12 / 10 = -1, y sobran -2
- -2 / 2 = -1, y sobran 0

La suma de lo devuelto es -20 - 10 - 2 = -32. Matemáticamente es coherente, pero no tiene sentido real, porque no existen billetes ni monedas negativos. El programa solo es correcto si se cumplen las condiciones de entrada.
