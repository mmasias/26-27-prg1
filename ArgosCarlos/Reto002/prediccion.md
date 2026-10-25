# Predicción del reto extendido

Si el cliente debe pagar 232 € y entrega 200 €, creo que el programa calculará un cambio negativo de -32 €. Como el programa no comprueba si el pago es suficiente, mostrará cantidades negativas de billetes y monedas.
## Resultado real y explicación

Al ejecutar el programa con un importe de 232 € y un pago de 200 €, el cambio calculado es -32 €. El programa muestra cantidades negativas de billetes y monedas porque no comprueba si el cliente ha pagado una cantidad suficiente. Java realiza las divisiones enteras y las operaciones de resto con valores negativos, por lo que el resultado no representa un cambio válido.