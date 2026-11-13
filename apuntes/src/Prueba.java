import java.util.scanner;

class Prueba {
    public static void main (string [] args){

        Scanner scanner = new Scanner (System.in);

        final int EDAD = 18;

        int respuesta; 
        System.out.println ("¿Cuantos años tienes?");
        respuesta = scanner.nextInt();

        ///Para que el ódigo sea óptimo se quita esto
        ///String mensaje = (respuesta >= EDAD ? "Si" : "No" ) + "eres mayor de edad"; 
        /// System.out.println (mensaje);
        
        String mensaje;

        if (respuesta>=EDAD){
            mensaje = "P";
        } else {
            mensaje = "No p";
        }

       mensaje = mensaje + "uedes pasar";
       System.out.println(mensaje);

        
        scanner.close();    
        
    }

}  