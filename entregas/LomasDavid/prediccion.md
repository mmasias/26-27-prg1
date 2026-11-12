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
