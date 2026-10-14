import java.util.scanner;

class OtroEjemplo {

    public static void main (string[] args) {

    Scanner scanner = new Scanner(System.in);

        final int LIMITE_EDAD = 18;

        int edad; 
        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();

        string mensaje = ((edad >= LIMITE_EDAD ? "E" : "No e") + "res mayor de edad");
        system.out.println(mensaje);
    } 
}
