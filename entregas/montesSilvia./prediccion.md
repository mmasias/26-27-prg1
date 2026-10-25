Al ejecutar el programa con un importe de 232 € y un pago de 200 €, el cambio calculado es de -32 €.
El programa muestra cantidades negativas para algunas denominaciones, porque las operaciones de división entera y resto se realizan con un número negativo. Por ejemplo, al dividir -32 entre 20 se obtiene -1, y el resto es -12.
Esto sucede porque el programa no contiene ninguna comprobación que impida que la cantidad entregada sea inferior al importe que se debe pagar. La solución del reto base presupone que siempre se cumple esa condición, tal como indica el enunciado.
Por tanto, el programa no gestiona correctamente este caso porque se incumple una de las condiciones iniciales.
