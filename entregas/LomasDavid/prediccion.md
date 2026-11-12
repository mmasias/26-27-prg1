# Predicción del reto extendido

**Caso:** el cliente paga 200 € por una compra de 232 € (no cumple la condición "entregado >= importe").

## Predicción (hecha ANTES de ejecutar)

El cambio sería 200 - 232 = -32. Java divide enteros truncando hacia cero,
así que creo que el programa no fallará ni avisará, sino que mostrará
cantidades negativas:

```
0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €
```

(-20 - 10 - 2 = -32)





\## Resultado real y explicación



El resultado real coincide con la predicción:



0 billete(s) de 100, 0 de 50, -1 de 20, -1 de 10, 0 de 5, -1 moneda(s) de 2 y 0 de 1.



\*\*Por qué ocurre:\*\* el programa calcula el cambio como `200 - 232 = -32` y no

comprueba que sea negativo (no se pueden usar `if`; la condición se da por

cumplida). En Java, la división entera trunca hacia cero y el operador `%` conserva

el signo del dividendo, así que con números negativos el algoritmo sigue

funcionando pero devuelve valores negativos:



\- -32 / 100 = 0 y resto -32; -32 / 50 = 0 y resto -32

\- -32 / 20 = -1 (trunca hacia cero) y resto -12

\- -12 / 10 = -1 y resto -2

\- -2 / 5 = 0 y resto -2

\- -2 / 2 = -1 y resto 0; el resto final es 0



Suma: -20 - 10 - 2 = -32. El programa "devuelve" -32 €, es decir, en realidad

faltan 32 € por cobrar. No falla ni avisa, simplemente produce una salida sin

sentido porque no valida la entrada.

