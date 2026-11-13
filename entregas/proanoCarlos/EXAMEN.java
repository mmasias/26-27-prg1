
import java.util.Scanner;

public class EXAMEN {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Paso 3: mostrar mensaje
        System.out.println("Examen parcial PRG1");

        // Paso 4: pedir edad
        System.out.print("Introduce la edad del alumno: ");
        int edad = teclado.nextInt();

        // Paso 6: validar edad par entre 16 y 99
        while (edad < 16 || edad > 99 || edad % 2 != 0) {
            System.out.print("Introduce una edad valida: ");
            edad = teclado.nextInt();
        }

        // Paso 5: mostrar mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        // Paso 7: pedir asignaturas
        System.out.print("Numero de asignaturas matriculadas: ");
        int asignaturas = teclado.nextInt();

        // Paso 8: validar asignaturas entre 1 y 10
        while (asignaturas < 1 || asignaturas > 10) {
            System.out.print("Introduce un numero entre 1 y 10: ");
            asignaturas = teclado.nextInt();
        }

        // Paso 9: pedir notas
        int sumaNotas = 0;
        int aprobadas = 0;
        int notaAlta = 0;
        int notaBaja = 10;

        for (int i = 1; i <= asignaturas; i++) {

            System.out.print("Nota de la asignatura " + i + ": ");
            int nota = teclado.nextInt();

            // Paso 13: validar notas entre 0 y 10
            while (nota < 0 || nota > 10) {
                System.out.print("Introduce una nota entre 0 y 10: ");
                nota = teclado.nextInt();
            }

            sumaNotas = sumaNotas + nota;

            // Paso 11: contar aprobadas
            if (nota >= 5) {
                aprobadas++;
            }

            // Paso 14: guardar nota más alta
            if (i == 1 || nota > notaAlta) {
                notaAlta = nota;
            }

            // Paso 15: guardar nota más baja
            if (i == 1 || nota < notaBaja) {
                notaBaja = nota;
            }
        }

        // Paso 10: calcular media
        double media = (double) sumaNotas / asignaturas;
        System.out.println("Media de las notas: " + media);

        // Paso 11: mostrar aprobadas
        System.out.println("Asignaturas aprobadas: " + aprobadas);

        // Paso 12: mostrar suspensas
        int suspensas = asignaturas - aprobadas;
        System.out.println("Asignaturas suspensas: " + suspensas);

        // Paso 14: mostrar nota más alta
        System.out.println("Nota mas alta: " + notaAlta);

        // Paso 15: mostrar nota más baja
        System.out.println("Nota mas baja: " + notaBaja);

    }
}
