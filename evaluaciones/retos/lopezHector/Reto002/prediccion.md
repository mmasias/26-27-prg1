# Predicción de salida: `Devolvercambio.java`

## Qué hace el programa

1.  Primero pide el **precio del producto** y el **dinero entregado** por el cliente ambos definidos como enteros.
2. Calculamos el cambio tras insertar los precios `cambio = pagoCliente - precioProducto`.
3. Descomponemos el cambio de mayor a menor valor con `/` para contar la cantidad de billetes a entregar y `%=` para quedarse con el resto de dinero que queda por repartir:
   100 € → 50 € → 20 € → 10 € → 5 € → 2 € → 1 €
4. Si el pago es suficiente (`pagoCliente >= precioProducto`) imprime el desglose de cada cantidad de billetes a entregar; si no, imprime `Error pago insuficiente`.

---

## Ejemplo 1: cambio normal

**Entrada:** precio `37`, entrega `200` → cambio = **163 €**


**Salida en consola:**

```
Cuantos euros debe pagar: 37
Cuantos euros entrega el cliente: 200
1 billete(s) de 100 €
1 billete(s) de 50 €
0 billete(s) de 20 €
1 billete(s) de 10 €
0 billete(s) de 5 €
1 moneda(s) de 2 €
1 moneda(s) de 1 €
```

---

## Ejemplo 2: pago exacto

**Entrada:** precio `50`, entrega `50` → cambio = **0 €**

```
Cuantos euros debe pagar: 50
Cuantos euros entrega el cliente: 50
0 billete(s) de 100 €
0 billete(s) de 50 €
0 billete(s) de 20 €
0 billete(s) de 10 €
0 billete(s) de 5 €
0 moneda(s) de 2 €
0 moneda(s) de 1 €
```

Como la condición es `>=`, el pago exacto **no** da error: se imprime el desglose completo con todo a cero.

---

## Ejemplo 3: pago insuficiente

**Entrada:** precio `80`, entrega `50` → cambio = **-30 €**

```
Cuantos euros debe pagar: 80
Cuantos euros entrega el cliente: 50
Error pago insuficiente
```
el desglose **no saldria** a que lo hemos puesto desde un mismo string y si el ternario nas da falso ese string no se muestra y se muestra el mensaje de error.

---

