# Explicación del código

Todo el programa está en la clase `ViajeMarco` (`ViajeMarco.java`).

## Constantes y atributos

| Elemento | Descripción |
|----------|-------------|
| `DISTANCIA_INICIAL` | Distancia inicial entre Marco y su madre (350 km). |
| `random` | Generador de números aleatorios compartido (`java.util.Random`). |

## Métodos

| Método | Descripción |
|--------|-------------|
| `aleatorio(min, max)` | Devuelve un `double` aleatorio entre `min` y `max`. |
| `climaMarco(numero)` | Convierte un número en `[0,1)` en `"FUERTE"`, `"NORMAL"` o `"BUENO"` para Marco. |
| `climaMadre(numero)` | Igual que el anterior, para la madre. |
| `descripcionClimaMarco(clima)` | Texto que se muestra según el clima de Marco. |
| `descripcionClimaMadre(clima)` | Texto que se muestra según el clima de la madre. |
| `velocidadMarco(velocidad, clima)` | Aplica la penalización del clima a la velocidad de Marco. |
| `velocidadMadre(velocidad, clima)` | Aplica la penalización del clima a la velocidad de la madre. |
| `calcularAvanceMarco(velocidad, horas)` | Kilómetros recorridos por Marco (`velocidad * horas`). |
| `calcularAvanceMadre(velocidad, horas)` | Kilómetros recorridos por la madre (`velocidad * horas`). |
| `main(args)` | Bucle principal de la simulación. |

## Flujo de `main`

1. Se fija `Locale.US` para que los decimales se impriman con punto.
2. Se inicializan `distancia = 350` y `dia = 0`.
3. Mientras `encontrado` sea `false`, cada iteración (un día):
   1. **Turno de Marco:** velocidad y horas aleatorias, clima, posibles imprevistos con Amedio, cálculo del avance.
   2. **Turno de la madre:** velocidad y horas aleatorias, clima, cálculo del avance.
   3. **Actualización de la distancia** y comprobación de si se han encontrado.
   4. **Extensión 2:** si quedan menos de 50 km, posible aviso que hace correr a Marco 25 km más.
   5. **Cierre del día:** mensaje de éxito o separador.
4. Al salir del bucle se muestra el número total de días.

## Observaciones y posibles mejoras

- `climaMarco` y `climaMadre` son idénticos; podrían unificarse en un único método `clima`.
- Del mismo modo, `calcularAvanceMarco` y `calcularAvanceMadre` hacen lo mismo.
- Las variables `climaMamá` y `velocidadMamá` usan tilde; es válido en Java, pero conviene evitarlo (`climaMama`, `velocidadMama`) para evitar problemas de codificación.
- Los textos sin tilde (`mama`, `dia`) son coherentes con evitar problemas de codificación en consola.
- Se podría usar `new Random(semilla)` para obtener simulaciones reproducibles (útil en pruebas).
- Las probabilidades y rangos podrían extraerse a constantes con nombre.
