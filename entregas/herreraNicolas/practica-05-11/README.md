# Practica 05-11: Centro comercial CF

Simulacion en Java del [reto CCCF](https://github.com/mmasias/PRG1/blob/main/temario/ejercicios/08-RetoCCCF.md).

## Funcionamiento

- La jornada dura 720 minutos, de 9:00 a 21:00.
- Cada minuto puede llegar una persona, con una probabilidad del 60 %.
- Cada cliente lleva entre 5 y 15 packs. Una caja procesa un pack por minuto.
- Las cuatro primeras cajas empiezan abiertas. La quinta sirve de refuerzo y la sexta se puede abrir desde el administrador.
- Se muestran las llegadas, la cola y los packs pendientes de cada caja.

En cada minuto primero avanzan las compras que ya estaban en las cajas, despues se comprueba la llegada de un cliente y se reparten las personas de la cola entre las cajas libres. Una compra nueva empieza a procesarse en el siguiente minuto.

## Refuerzo y administrador

La caja 5 se abre automaticamente cuando la cola supera las 15 personas. Termina de atender al menos a cinco clientes y sigue abierta mientras la cola supere 15. Solo se cierra cuando ha terminado con su cliente actual.

Al iniciar el programa:

- Escribir `n` para ejecutar la simulacion normal.
- Escribir `s` para usar el modo superadministrador.

El administrador puede cambiar las cajas al inicio y cada 60 minutos:

| Opcion | Accion |
| :---: | :--- |
| `1` a `6` | Abrir o cerrar la caja indicada |
| `7` | Devolver la caja 5 al refuerzo automatico |
| `0` | Continuar la simulacion |

Apagar una caja impide que reciba nuevos clientes, pero deja terminar la compra que ya esta atendiendo. Si se cambia manualmente la caja 5, el administrador toma su control hasta elegir la opcion `7`. Esta decision manual sustituye la regla automatica de los cinco clientes.

## Resumen al cierre

Se muestran los minutos sin cola, las personas que siguen esperando, las personas atendidas y los packs vendidos. Tambien se indican las llegadas y las personas que siguen en caja para comprobar que no se pierde ningun cliente.

Los minutos sin cola se cuentan despues de repartir clientes. La simulacion termina en el minuto 720, aunque queden personas esperando o compras pendientes. Los items se contabilizan en packs, que es la unidad que proporciona el enunciado; cada pack procesado cuenta como una unidad vendida, incluso si la compra aun no ha terminado.

## Compilar y ejecutar

Desde la raiz del repositorio, con Java 17 o superior en macOS o Linux:

```bash
javac -encoding UTF-8 -d /tmp/cccf-clases entregas/herreraNicolas/practica-05-11/CentroComercialCF.java
java -cp /tmp/cccf-clases CentroComercialCF
```

## Desarrollo

1. Llegadas y cola durante la jornada.
2. Atencion de las cuatro cajas.
3. Contadores y resumen final.
4. Caja de refuerzo automatica.
5. Superadministrador y control de seis cajas.
