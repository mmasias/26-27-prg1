import java.util.Scanner;

public class Mayor_menor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        System.out.println("introduce tu edad");
        int edad = scanner.nextInt();

        String mensaje =  "Eres " + (edad < 18 ? "mayor" : "menor") + " de edad";

        System.out.println(mensaje);


    }
    
}