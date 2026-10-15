import java.util.Scanner;

public class Mayor_menor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        System.out.println("introduce tu edad");
        int edad = scanner.nextInt();

        String mensaje = edad < 18 ? "Eres menor de edad" : "Eres mayor de edad";
        System.out.println(mensaje);
    }
    
}