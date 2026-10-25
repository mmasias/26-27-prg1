**Predicción si se incumple la siguiente condición:**

El cliente paga 200`€` por una compra de 232`€`.


**Predicción.** 

Al llegar a la línea 15, que es donde se calcula la variable diferenciaPago, el resultado será negativo, lo que ocasionará que en los cálculos siguientes referentes al cambio, el número será negativo. Y en la terminal aparecerá como **- x billete(s) de x`€`**.

```Java
int diferenciaPago = eurosPago - eurosPorPagar;
```


**Resultado de la terminal**

0 billete(s) de 100 €
0 billete(s) de 50 €
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €

**Explicación del resultado**

El valor asignado a diferenciaPago fue -32, por lo que todos los cálculos siguientes dieron el resultado correcto y en negativo.
