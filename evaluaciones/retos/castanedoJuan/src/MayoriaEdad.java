import java.util.Scanner;

class EjemploEdad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        final int EDAD_MINIMA = 18;

        System.out.println(
            edad>=EDAD_MINIMA?"Eres mayor de edad":"Eres menor de edad"
        );        
    }
}