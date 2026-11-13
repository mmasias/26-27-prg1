import java.util.scanner;

class clase20oct {
    public static void main (string [] args){

        Scanner scanner = new Scanner (System.in);

        final int MINIMO = 0;
        final int MAXIMO = 100;
        int numeroAleatorio = (int) (Math.random ()*(MAXIMO-MINIMO)+MINIMO;) 

        System.out.println ("Adivina el numero que estoy pensando");

        int numeroDelUsuario;
        boolean QuedanIntentos = true;
        final int NUMERO_MAXIMO_DE_INTENTOS= 3;
        boolean haAdivinado = false;
        
        
        //Con ternarios
       // string mensaje = (numeroDelUsuario==numeroAleatorio? "":"No ") + "Adivinaste";
       // System.out.println (mensaje);

       do{
        numeroDeIntentos = numeroDeIntentos + 1;
        QuedanIntentos = numeroDeIntentos < NUMERO_MAXIMO_DE_INTENTOS;
        System.out.println ("Adivina el numero que estoy pensando");
        numeroDelUsuario = scanner.nextInt();

        if (numeroAleatorio==numeroDelUsuario){
            System.out.println("Adivinaste")
            haAdivinado = true;

        } else {

            System.out.println("no adivinaste");

            
        }
        }while (!haAdivinado && QuedanIntentos);
        System.out.println (haAdivinado?"":"NO")+ "LO ADIVINASTE EN ["+numeroDeIntentos "];

        scanner.close();   
    }
    
}