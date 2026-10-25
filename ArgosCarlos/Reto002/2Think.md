# 2Think: Sistema monetario con monedas de 4, 3 y 1

## ¿Se obtiene siempre el mínimo número de monedas?
No, elegir siempre la moneda de mayor valor no garantiza obtener el mínimo número de monedas.
Por ejemplo, si tenemos que devolver 6 unidades, el procedimiento de elegir la moneda más grande selecciona primero una moneda de 4. Después quedan 2 unidades, que se devuelven con dos monedas de 1. En total, se utilizan 3 monedas.

Sin embargo, existe una solución mejor: utilizar dos monedas de 3 unidades, que suman 6. De esta forma, solo necesitamos 2 monedas. Por tanto, este sistema monetario demuestra que elegir siempre la moneda más grande no siempre produce la solución óptima.

## ¿Qué tiene el sistema monetario del euro que permite utilizar este procedimiento?

El sistema monetario del euro tiene una combinación de denominaciones que permite utilizar este procedimiento voraz para obtener el menor número de monedas y billetes en las cantidades habituales. Sus valores están organizados de manera que, empezando por la denominación más grande y continuando con las siguientes, se obtiene una solución óptima.

Esto no ocurre con cualquier sistema monetario, como demuestra el ejemplo de las monedas de 4, 3 y 1.