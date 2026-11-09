import java.util.Scanner;

class ComprobarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        System.out.println("Ingresa tu edad");
        edad = scanner.nextInt();
        final int MAYOR_DE_EDAD = 18;
        
        String mensaje = (edad >= MAYOR_DE_EDAD ? "E" : "No e") + "res mayor de edad.";
        System.err.println(mensaje);

    }
}