# Predicción para 232 € a pagar y 200 € entregados

Antes de ejecutar este caso, predigo esta salida:

```text
¿Cuántos euros debe pagar?
232
¿Con cuántos euros paga?
200
0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €
```

El cambio será 200 - 232 = -32 €. La división entera de Java trunca
hacia cero y el resto puede ser negativo. Por eso salen -1 billete de
20 €, -1 billete de 10 € y -1 moneda de 2 €. El programa no tiene una
condición que impida mostrar esas cantidades.

## Resultado real

Después del commit de la predicción, ejecuté el caso 232/200. La salida
coincidió con lo previsto: 0, 0, -1, -1, 0, -1 y 0 piezas, en orden de
100 a 1 €.

El cambio calculado fue -32 €. Como no hay una validación para impedir
un pago insuficiente, la división entera y el módulo produjeron esas
cantidades negativas.