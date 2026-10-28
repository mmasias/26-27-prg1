
# Predicción del reto extendido

## Caso probado

- Importe a pagar: 232 €
- Cantidad entregada: 200 €

## Predicción

Creo que el programa calculará un cambio de -32 €.

Como el programa no comprueba si el cliente ha entregado suficiente dinero, realizará las divisiones y los restos con un número negativo. Por ello, aparecerán cantidades negativas en algunas denominaciones.

No mostrará un mensaje de error porque el programa no tiene ninguna condición que compruebe esta situación.

## Explicación del resultado real

El resultado coincide con la predicción.

El cambio calculado es -32 €, porque el cliente entrega 200 € cuando debe pagar 232 €.

Java permite realizar divisiones enteras y calcular el resto con números negativos. Como el programa no comprueba si el cambio es negativo, aparecen cantidades negativas de billetes y monedas.

Esto demuestra que el programa funciona correctamente cuando se cumplen las condiciones del enunciado, pero no controla los casos en los que el cliente entrega menos dinero del que debe pagar.
