**Prediccion antes de ejecutar:**
Si el cliente paga 200 euros por una compra de 1 euro, la variable de cambio inicial sera de '200 - 1 = 199'.
La lista matematica quedara de la siguiente manera sobre esos 199 euros positivos:
- '199 / 100' dara '1'. El resto se actualizara con '199 % 100', que es '99'.
- '99 / 50' dara '1'. El resto se actualizara con '99 % 50', que es '49'.
- '49 / 20' dara '2'. El resto se actualizara con '49 % 20', que es '-'9'.
- '9 / 10' dara '0'.
- '9 / 5' dara '1'. El resto se actualizara con '9 % 5', que es '4".
- '2 / 2' dara '2'. El resto se actualizara con '4 % 2', que es '0'.
- '0 / 1' dara '0'.

El programa imprimira:
1 billete(s) de 100 euros
1 billete(s) de 50 euros
2 billete(s) de 20 euros
0 billete(s) de 10 euros
1 billete(s) de 5 euros
2 moneda(s) de 2 euros
0 moneda(s) de 1 euros

**Explicacion del resultado real:**
Al ejecutar el programa, el comportamiento coincide exactamente con la prediccion. Como el pago es mayor que el importe, el programa calcula un cambio positivo de 199 euros. Las divisiones enteras y los operadores de modulo funcionan de forma natural, desglosando correctamente el importe en las denominaciones exactas sin generar valores negativos ni errores logicos.