# Reto 002 · Predicción

## Caso

Debe pagar **232 €** y paga con **200 €** (se incumple la condición "lo entregado es mayor o igual que el importe").

## Predicción (antes de ejecutar)

El cambio vale `200 - 232 = -32`. El programa no comprueba nada, así que sigue haciendo divisiones y restos con un número negativo.

En Java, la división entera trunca hacia cero y el resto `%` conserva el signo del dividendo:

| Paso | Operación | Resultado | Resto que queda |
|-|-|-|-|
| 100 € | `-32 / 100` | 0 | `-32 % 100 = -32` |
| 50 € | `-32 / 50` | 0 | `-32 % 50 = -32` |
| 20 € | `-32 / 20` | -1 | `-32 % 20 = -12` |
| 10 € | `-12 / 10` | -1 | `-12 % 10 = -2` |
| 5 € | `-2 / 5` | 0 | `-2 % 5 = -2` |
| 2 € | `-2 / 2` | -1 | `-2 % 2 = 0` |
| 1 € | resto | 0 | |

Predigo que mostrará:

```
0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €
```

Es decir, no falla ni avisa: muestra cantidades negativas que suman -32 € (lo que el cliente "debe" todavía).

## Resultado real y explicación

Al ejecutarlo con 232 y 200 el programa mostró:

```
0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €
```

Coincide con la predicción. Explicación:

1. El programa confía en que se cumple la condición y no comprueba nada (tampoco podría: no se permiten `if`). Calcula `cambio = 200 - 232 = -32` sin quejarse.
2. Las operaciones `/` y `%` funcionan igual con negativos, pero en Java la división entera **trunca hacia cero** (`-32 / 20` da `-1`, no `-2`) y el resto **toma el signo del dividendo** (`-32 % 20` da `-12`). Por eso el resto se mantiene negativo y en cada paso salen 0 o -1 piezas.
3. El resultado es "coherente" en lo matemático: `-20 - 10 - 2 = -32`, justo lo que falta por pagar. Pero no tiene sentido físico: no existen "-1 billetes".

Conclusión: el programa no falla ni avisa; produce una salida absurda porque los datos violan su precondición. Garantizar que lo entregado es mayor o igual que el importe es responsabilidad de quien introduce los datos.
