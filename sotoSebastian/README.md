# Reto CCCF

Simulación en Java del funcionamiento de las cajas de un centro comercial durante una jornada de 12 horas (720 minutos).

## Requisitos del reto

- Probabilidad de llegada de un cliente: 60 % por minuto.
- Cada cliente lleva entre 5 y 15 packs de artículos.
- Cada caja tarda un minuto por pack.
- El sistema comienza con cuatro cajas.
- Se muestra la llegada de clientes, el tamaño de la cola y el estado de las cajas.
- Al terminar la jornada se muestra un resumen con las estadísticas.
- La versión ampliada permite gestionar hasta seis cajas y abrir una caja automática cuando la cola supera las 15 personas.

## Archivos

- `CCCF.java`: código fuente del simulador.
- `CCCF.md`: explicación y código fuente completo en formato Markdown.

## Cómo compilar y ejecutar

Necesitas tener instalado el JDK de Java. Desde la carpeta que contiene `CCCF.java`, ejecuta:

```bash
javac CCCF.java
java CCCF
```

La contraseña de demostración del superadministrador es `admin`.

## Nota

Los resultados cambian en cada ejecución porque las llegadas de clientes y la cantidad de artículos se generan aleatoriamente.
