# CCCF.java — Simulador del centro comercial

Este documento contiene el código fuente Java del reto CCCF y una breve descripción de su funcionamiento.

## Objetivo

Simular una jornada de 720 minutos en un centro comercial con clientes que llegan aleatoriamente, esperan en una cola y son atendidos por cajas.

## Parámetros principales

| Parámetro | Valor |
|---|---:|
| Duración de la jornada | 720 minutos |
| Probabilidad de llegada | 60 % por minuto |
| Packs por cliente | Entre 5 y 15 |
| Cajas iniciales | 4 |
| Máximo de cajas | 6 |
| Tiempo de atención | 1 minuto por pack |

## Cómo ejecutar

```bash
javac CCCF.java
java CCCF
```

La contraseña de demostración del superadministrador es `admin`.

## Código fuente

El siguiente bloque es el contenido de `CCCF.java`:

```java

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class CCCF {

    // CONSTANTES DEL PROGRAMA
    static final int MINUTOS_JORNADA = 720;
    static final double PROBABILIDAD_LLEGADA = 0.60;
    static final int MIN_ITEMS = 5;
    static final int MAX_ITEMS = 15;
    static final int MAX_CAJAS = 6;
    static final int CAJAS_INICIALES = 4;

    // REPRESENTACION DE UN CLIENTE
    static class Cliente {
        int items;

        Cliente(int items) {
            this.items = items;
        }
    }

    // REPRESENTACION DE UNA CAJA
    static class Caja {
        int tiempoRestante = 0;
        int itemsCliente = 0;
        boolean activa = false;
        boolean automatica = false;

        boolean estaLibre() {
            return tiempoRestante == 0;
        }

        void atender(Cliente cliente) {
            itemsCliente = cliente.items;
            tiempoRestante = cliente.items;
        }
    }

    // VARIABLES GENERALES
    static Caja[] cajas = new Caja[MAX_CAJAS];
    static Queue<Cliente> cola = new ArrayDeque<>();
    static Random random = new Random();
    static Scanner teclado = new Scanner(System.in);

    static int personasAtendidas = 0;
    static int itemsVendidos = 0;
    static int minutosSinCola = 0;

    static int cajaAutomatica = -1;
    static int clientesAtendidosAutomaticamente = 0;

    // INICIALIZAR LAS CAJAS
    static void inicializarCajas() {

        for (int i = 0; i < MAX_CAJAS; i++) {
            cajas[i] = new Caja();
        }

        for (int i = 0; i < CAJAS_INICIALES; i++) {
            cajas[i].activa = true;
        }
    }

    // PANEL DEL SUPERADMINISTRADOR
    static void panelAdministrador() {

        System.out.println("\n================================");
        System.out.println(" PANEL DEL SUPERADMINISTRADOR");
        System.out.println("================================");

        System.out.print("Introduce la contrasena: ");
        String password = teclado.nextLine();

        if (!password.equals("admin")) {
            System.out.println("Acceso denegado.");
            System.out.println("Se mantienen las 4 cajas iniciales.");
            return;
        }

        System.out.println("Acceso autorizado.");

        int opcion;

        do {
            System.out.println("\n--- GESTION DE CAJAS ---");

            for (int i = 0; i < MAX_CAJAS; i++) {
                String estado = cajas[i].activa ? "ENCENDIDA" : "APAGADA";
                System.out.println("Caja " + (i + 1) + ": " + estado);
            }

            System.out.println("\n1. Encender una caja");
            System.out.println("2. Apagar una caja");
            System.out.println("0. Iniciar simulacion");

            System.out.print("Selecciona una opcion: ");

            opcion = leerNumero();

            if (opcion == 1 || opcion == 2) {

                System.out.print("Numero de caja (1-6): ");
                int numero = leerNumero();

                if (numero < 1 || numero > MAX_CAJAS) {
                    System.out.println("Numero de caja incorrecto.");
                    continue;
                }

                Caja caja = cajas[numero - 1];

                if (opcion == 1) {

                    if (!caja.activa) {
                        caja.activa = true;
                        System.out.println("Caja encendida.");
                    } else {
                        System.out.println("La caja ya esta encendida.");
                    }

                } else {

                    if (!caja.activa) {
                        System.out.println("La caja ya esta apagada.");
                    } else if (caja.tiempoRestante > 0) {
                        System.out.println("No puedes apagar una caja ocupada.");
                    } else {
                        caja.activa = false;
                        System.out.println("Caja apagada.");
                    }
                }

            } else if (opcion != 0) {
                System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);
    }

    // LEER NUMEROS SIN QUE EL PROGRAMA SE INTERRUMPA
    static int leerNumero() {

        while (!teclado.hasNextInt()) {
            System.out.print("Introduce un numero valido: ");
            teclado.next();
        }

        int numero = teclado.nextInt();
        teclado.nextLine();

        return numero;
    }

    // BUSCAR UNA CAJA LIBRE
    static int buscarCajaLibre() {

        for (int i = 0; i < MAX_CAJAS; i++) {

            if (cajas[i].activa && cajas[i].estaLibre()) {
                return i;
            }
        }

        return -1;
    }

    // AMPLIADO: ABRIR UNA CAJA AUTOMATICA
    static void gestionarCajaAutomatica() {

        if (cola.size() > 15 && cajaAutomatica == -1) {

            for (int i = 0; i < MAX_CAJAS; i++) {

                if (!cajas[i].activa) {

                    cajas[i].activa = true;
                    cajas[i].automatica = true;

                    cajaAutomatica = i;
                    clientesAtendidosAutomaticamente = 0;

                    System.out.println(
                        ">>> Se abre automaticamente la Caja "
                        + (i + 1)
                    );

                    break;
                }
            }
        }
    }

    // AVANZAR UN MINUTO EN LAS CAJAS
    static void actualizarCajas() {

        for (int i = 0; i < MAX_CAJAS; i++) {

            Caja caja = cajas[i];

            if (caja.activa && caja.tiempoRestante > 0) {

                caja.tiempoRestante--;

                // EL CLIENTE HA TERMINADO SU COMPRA
                if (caja.tiempoRestante == 0) {

                    personasAtendidas++;
                    itemsVendidos += caja.itemsCliente;

                    if (i == cajaAutomatica) {
                        clientesAtendidosAutomaticamente++;
                    }

                    caja.itemsCliente = 0;
                }
            }
        }
    }

    // ASIGNAR CLIENTES A LAS CAJAS LIBRES
    static void asignarClientes() {

        while (!cola.isEmpty()) {

            int numeroCaja = buscarCajaLibre();

            if (numeroCaja == -1) {
                break;
            }

            Cliente cliente = cola.poll();

            cajas[numeroCaja].atender(cliente);
        }
    }

    // COMPROBAR SI SE PUEDE CERRAR LA CAJA AUTOMATICA
    static void cerrarCajaAutomatica() {

        if (cajaAutomatica != -1) {

            if (clientesAtendidosAutomaticamente >= 5
                    && cola.size() <= 15
                    && cajas[cajaAutomatica].estaLibre()) {

                cajas[cajaAutomatica].activa = false;
                cajas[cajaAutomatica].automatica = false;

                System.out.println(
                    ">>> Se cierra la Caja automatica "
                    + (cajaAutomatica + 1)
                );

                cajaAutomatica = -1;
            }
        }
    }

    // MOSTRAR EL ESTADO DE TODAS LAS CAJAS
    static void mostrarCajas() {

        for (int i = 0; i < MAX_CAJAS; i++) {

            System.out.print("Caja" + (i + 1) + ":[");

            if (!cajas[i].activa) {
                System.out.print("APAGADA");
            } else {
                System.out.print(cajas[i].tiempoRestante);
            }

            System.out.print("]");

            if (i < MAX_CAJAS - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();
    }

    // SIMULACION PRINCIPAL
    static void simularJornada() {

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {

            // 1. AVANZA EL TIEMPO DE LAS COMPRAS
            actualizarCajas();

            // 2. COMPROBAR SI LLEGA UN CLIENTE
            boolean llegaCliente =
                random.nextDouble() < PROBABILIDAD_LLEGADA;

            int itemsLlegada = 0;

            if (llegaCliente) {

                itemsLlegada = random.nextInt(
                    MAX_ITEMS - MIN_ITEMS + 1
                ) + MIN_ITEMS;

                cola.offer(new Cliente(itemsLlegada));
            }

            // 3. ABRIR UNA CAJA EXTRA SI ES NECESARIO
            gestionarCajaAutomatica();

            // 4. ASIGNAR CLIENTES A LAS CAJAS LIBRES
            asignarClientes();

            // 5. COMPROBAR SI SE CIERRA LA CAJA EXTRA
            cerrarCajaAutomatica();

            // 6. CONTAR MINUTOS SIN CLIENTES EN COLA
            if (cola.isEmpty()) {
                minutosSinCola++;
            }

            // 7. MOSTRAR INFORMACION DEL MINUTO
            System.out.print("MINUTO " + minuto + " - ");

            if (llegaCliente) {
                System.out.print(
                    "Llega 1 persona (" + itemsLlegada + " items)"
                );
            } else {
                System.out.print("No llega nadie");
            }

            System.out.println(" - En Cola: " + cola.size());

            mostrarCajas();

            System.out.println(
                "- - - - - - - - - - - - - - - - - - - -"
            );
        }

        mostrarResumen();
    }

    // RESUMEN FINAL DEL DIA
    static void mostrarResumen() {

        System.out.println("\nRESUMEN");
        System.out.println(
            "================================================"
        );

        System.out.println(
            "Minutos con cola en cero       : " + minutosSinCola
        );

        System.out.println(
            "Personas en cola al cierre     : " + cola.size()
        );

        System.out.println(
            "Personas atendidas en el dia   : " + personasAtendidas
        );

        System.out.println(
            "Articulos vendidos en el dia   : " + itemsVendidos
        );

        System.out.println(
            "================================================"
        );
    }

    // PROGRAMA PRINCIPAL
    public static void main(String[] args) {

        inicializarCajas();

        System.out.println("================================");
        System.out.println(" SIMULADOR CENTRO COMERCIAL CCCF");
        System.out.println("================================");

        panelAdministrador();

        System.out.println("\nComienza la jornada comercial.");
        System.out.println("Duracion: 720 minutos.");

        simularJornada();

        System.out.println("\nFin de la simulacion.");
    }
}
```
