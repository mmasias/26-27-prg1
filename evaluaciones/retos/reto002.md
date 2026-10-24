# Reto 002: Devolver el cambio

> Fecha de entrega: *por determinar*

Una caja registradora necesita indicar al cajero cuántos billetes y monedas de cada tipo debe entregar como cambio, usando siempre el menor número de piezas posible.

Desarrolle un programa que pida el importe a pagar y la cantidad entregada por el cliente, y muestre el desglose del cambio.

```
java DevolverCambio

¿Cuántos euros debe pagar?
232

¿Con cuántos euros paga?
400

1 billete(s) de 100 €
1 billete(s) de 50 €
0 billete(s) de 20 €
1 billete(s) de 10 €
1 billete(s) de 5 €
1 moneda(s) de 2 €
1 moneda(s) de 1 €
```

## Condiciones

- Los importes son cantidades enteras de euros: no hay céntimos.
- La cantidad entregada es siempre mayor o igual que el importe a pagar.
- La caja dispone de billetes de 100, 50, 20, 10 y 5 €, y de monedas de 2 y 1 €. No hay billetes de 200 ni de 500.
- Se muestran todas las denominaciones, también las que no intervienen en el cambio.

## Restricciones

Solo se pueden usar variables, constantes, operadores y entrada/salida por consola. **No se permiten estructuras de control** (`if`, `switch`, bucles) **ni matrices**.

## Entrega

En la carpeta de entregas de **su fork**, dentro de su carpeta *apellidoNombre*:

<div align=center>

|Parte|Artefacto|
|-|-|
|Reto base|`DevolverCambio.java`, partiendo de la [plantilla](https://github.com/mmasias/26-27-prg1/blob/entregas/plantillas/ClaseJava.java)
|Reto extendido|`prediccion.md`, con la predicción y, después, la explicación del resultado real
|Reto ampliado|`DevolverCambioCentimos.java`
|2Think|Se discute en la revisión pública

</div>

**FUNDAMENTAL:** La predicción del reto extendido se registra en su propio commit, **antes** de ejecutar el programa con esos datos. La explicación del resultado va en un commit posterior.

## Reto base

Desarrolle el programa descrito y compruébelo, como mínimo, con estos casos:

<div align=center>

|Debe pagar|Paga con|
|-|-|
|232|400|
|1|200|
|37|37|
|5|1000|

</div>

## Reto extendido

Antes de ejecutarlo, prediga qué mostrará su programa si se incumple alguna de las condiciones: por ejemplo, si el cliente paga 200 € por una compra de 232 €. Ejecútelo y explique el resultado.

## Reto ampliado

Los importes pasan a admitir céntimos (por ejemplo, `23,45`), y la caja dispone también de monedas de 50, 20, 10, 5, 2 y 1 céntimos.

Extienda el programa para que el desglose sea correcto **en todos los casos**. Busque importes con los que una solución poco cuidadosa falle por un céntimo.

## 2Think

En un país imaginario solo circulan monedas de 4, 3 y 1 unidades.

- Adapte su programa a ese sistema de monedas.
- ¿Entrega siempre el menor número posible de monedas? Si no es así, encuentre un contraejemplo.
- ¿Qué tiene el sistema del euro para que el mismo procedimiento sí funcione?
