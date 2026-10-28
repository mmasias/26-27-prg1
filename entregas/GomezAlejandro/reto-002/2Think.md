
# 2Think: Sistema de monedas

## 1. Adaptación del programa

En este sistema imaginario solo existen monedas de 4, 3 y 1 unidades.

Para calcular el cambio, primero dividimos el importe entre 4 y nos quedamos con el resto. Después, dividimos el resto entre 3 y, finalmente, el resto que quede serán monedas de 1 unidad.

## 2. ¿Entrega siempre el menor número posible de monedas?

No, este procedimiento no siempre entrega el menor número de monedas posible.

Por ejemplo, para devolver 6 unidades:

- El procedimiento entrega 1 moneda de 4 y 2 monedas de 1, utilizando 3 monedas.
- La solución óptima sería entregar 2 monedas de 3, utilizando solamente 2 monedas.

Por tanto, el procedimiento no siempre obtiene el mínimo número de monedas.

## 3. ¿Qué tiene el sistema del euro para que el mismo procedimiento sí funcione?

El sistema de denominaciones del euro permite utilizar este procedimiento para obtener el cambio con el menor número de piezas posible.

En cambio, con las monedas de 4, 3 y 1 unidades, el procedimiento puede dar una solución que no sea la óptima.
