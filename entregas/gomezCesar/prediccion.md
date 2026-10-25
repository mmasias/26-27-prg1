# Predicción

Caso: debe pagar con 232 € y paga con 200 €

Para mí, lo más coherente sería que diera error o que el programa se rompa. Según mi vivencia personal, a la hora de pagar online con saldo insuficiente, ha habido ocasiones en las que dió error y acto seguido me di cuenta de que tenía que rellenar mi tarjeta.

No obstante, mi segunda opción de predicción (si se permite) es que salgan ceros.

# Resultado final

```
0 billete(s) de 100 €
0 billete(s) de 50 € 
-1 billete(s) de 20 €
-1 billete(s) de 10 €
0 billete(s) de 5 €
-1 moneda(s) de 2 €
0 moneda(s) de 1 €
```

# Explicación

Dado este resultado, me he equivocado con mi predicción, si bien no con parte de la segunda que propuse.

Como he podido observar y concluir, los números dan ceros y negativos porque Java se limita a hacer las cuentas, y estas dan negativo. Java no sabe que no se puede devolver en negativo.
