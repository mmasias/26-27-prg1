import java.util.Scanner;
class Examenautomaticopersonalizado{
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);
        int primerfactor = 0;
        int segundofactor1 = 0;
        int segundofactor2 = 0;
        int segundofactor3 = 0;
        int segundofactor4 = 0;
        int segundofactor5 = 0;
        int opcion = 0;
        double puntuacion = 0;
        String dificultad = "a";
        while (opcion != 3){
            System.out.println("Escoje una el numero de una opcion");   
            System.out.println("1. Configuracion\n2. Ejecucion del test\n3. Salir del sistema" );
            opcion = Scanner.nextInt();

            if (opcion == 1) {
                System.out.println("introduce un primer factor del 1 al 10:");
                primerfactor = Scanner.nextInt();
                System.out.println("introduce el nivel de dificultad, facil, normal o dificil: ");
                dificultad = Scanner.next();

                if (dificultad.equalsIgnoreCase("facil") ){
                    segundofactor1 = (int) (Math.random()* 6 + 1);
                    segundofactor2 = (int) (Math.random()* 6 + 1);
                    segundofactor3 = (int) (Math.random()* 6 + 1);
                    segundofactor4 = (int) (Math.random()* 6 + 1);
                    segundofactor5 = (int) (Math.random()* 6 + 1);
                }else if (dificultad.equalsIgnoreCase("normal")) {
                    segundofactor1 = (int) (Math.random() *10);
                    segundofactor2 = (int) (Math.random() *10);
                    segundofactor3 = (int) (Math.random() *10);
                    segundofactor4 = (int) (Math.random() *10);
                    segundofactor5 = (int) (Math.random() *10);
                }else if (dificultad.equalsIgnoreCase("dificil")) {
                    segundofactor1 = (int) (Math.random() * 5 + 6);
                    segundofactor2 = (int) (Math.random() * 5 + 6);
                    segundofactor3 = (int) (Math.random() * 5 + 6);
                    segundofactor4 = (int) (Math.random() * 5 + 6);
                    segundofactor5 = (int) (Math.random() * 5 + 6);
                }else {
                    System.out.println("opcion no valida");
                }
            }else if (opcion == 2){
                if (dificultad.equals("a")){
                    System.out.println("configura primero");
                }
                else{
                    System.out.println("Resuelve estas 5 operaciones: ");
                    System.out.println(primerfactor + " * " + segundofactor1);
                    int resultado1 = primerfactor * segundofactor1;
                    int respuesta1 = Scanner.nextInt();
                    if (resultado1==respuesta1){
                        puntuacion = puntuacion + 2;
                    }else{
                        puntuacion = puntuacion - 0.5;
                    }
                    System.out.println(primerfactor + " * " + segundofactor2);
                    int resultado2 = primerfactor * segundofactor2;
                    int respuesta2 = Scanner.nextInt();
                    if (resultado2==respuesta2){
                        puntuacion = puntuacion + 2;
                    }else{
                        puntuacion = puntuacion - 0.5;
                    }
                    System.out.println(primerfactor + " * " + segundofactor3);
                    int resultado3 = primerfactor * segundofactor3;
                    int respuesta3 = Scanner.nextInt();
                    if (resultado3==respuesta3){
                        puntuacion = puntuacion + 2;
                    }else{
                        puntuacion = puntuacion - 0.5;
                    }
                                        System.out.println(primerfactor + " * " + segundofactor4);
                    int resultado4 = primerfactor * segundofactor4;
                    int respuesta4 = Scanner.nextInt();
                    if (resultado4==respuesta4){
                        puntuacion = puntuacion + 2;
                    }else{
                        puntuacion = puntuacion - 0.5;
                    }
                                        System.out.println(primerfactor + " * " + segundofactor5);
                    int resultado5 = primerfactor * segundofactor5;
                    int respuesta5 = Scanner.nextInt();
                    if (resultado5==respuesta5){
                        puntuacion = puntuacion + 2;
                    }else{
                        puntuacion = puntuacion - 0.5;
                    }
                    System.out.println("Tu puntuacion ha sido de " + puntuacion + " puntos sobre 10");
                }

            }
        }
    }
}