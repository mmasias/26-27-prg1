import java.util.Scanner;

public class Reto2Think {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué cantidad de cambio necesitas en este país imaginario?");
        int cambio = teclado.nextInt();

        // Cálculo con monedas de 4, 3 y 1
        int m4 = cambio / 4;
        cambio = cambio % 4;

        int m3 = cambio / 3;
        cambio = cambio % 3;

        int m1 = cambio; 

        System.out.println(m4 + " moneda(s) de 4 unidades");
        System.out.println(m3 + " moneda(s) de 3 unidades");
        System.out.println(m1 + " moneda(s) de 1 unidad");

        teclado.close();
    }
}