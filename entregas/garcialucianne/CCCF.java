public class CCCF{
    public static void main(String[]args){
        int tiempoAtencion = 720;
        int minuto=0;
        
        int caja1= 0;
        int caja2=0;
        int caja3= 0;
        int caja4= 0;

        int llegadaPersona=0; 
        int personasCola= 0;
        int estadoCajas=0;
        
        double probabilidadLlegadaClienteNuevo= 0.6;
        

        final int ITEMSMINIMO= 5;
        final int ITEMSMAXIMO= 15;
        int cantidaditems;

        

        do { 
            minuto++;
            double probabilidadClienteNuevo =Math.random();
            llegadaPersona=
            (probabilidadClienteNuevo<=probabilidadLlegadaClienteNuevo)? 1:0;

            if (llegadaPersona == 1){
                personasCola =personasCola +1;
            }

            if (personasCola>0 && caja1==0){
                cantidaditems= (int)(Math.random()*(ITEMSMAXIMO-
                ITEMSMINIMO +1 ))+ ITEMSMINIMO;
                caja1=cantidaditems;
                personasCola = personasCola-1;

            }
            if (personasCola>0 && caja2==0){
                
                cantidaditems= (int)(Math.random()*(ITEMSMAXIMO-
                ITEMSMINIMO +1 ))+ ITEMSMINIMO;
                caja2=cantidaditems;
                personasCola = personasCola-1;
            }
            if (personasCola>0 && caja3==0){
                
                cantidaditems= (int)(Math.random()*(ITEMSMAXIMO-
                ITEMSMINIMO +1 ))+ ITEMSMINIMO;
                caja3=cantidaditems;
                personasCola = personasCola-1;
            }
            if (personasCola>0 && caja4==0){
                
                cantidaditems= (int)(Math.random()*(ITEMSMAXIMO-
                ITEMSMINIMO +1 ))+ ITEMSMINIMO;
                caja4=cantidaditems;
                personasCola = personasCola-1;
            }

            if (llegadaPersona==1){
                System.out.println("Minuto "+ minuto +"-"+ "llega 1 persona"+"-"+ "En cola: "
                +personasCola);
            }else{
                System.out.println("Minuto: "+ minuto +"-"+ "No llega nadie "+"-" +"En cola : " +personasCola);
            }


            System.out.println("Caja1:[" + ((caja1 == 0) ? 0 : caja1) + "] | " +
            "Caja2:[" + ((caja2 == 0) ? 0 : caja2) + "] | " +
            "Caja3:[" + ((caja3 == 0) ? 0 : caja3) + "] | " +
            "Caja4:[" + ((caja4 == 0) ? 0 : caja4) + "]");
            System.out.println("---------------------------------------------------------------");

            caja1 = (caja1 > 0) ? (caja1 - 1) : 0;
            caja2 = (caja2 > 0) ? (caja2 - 1) :0;
            caja3 = (caja3 > 0) ? (caja3 - 1) : 0;
            caja4 = (caja4 > 0) ? (caja4 - 1) : 0;


                        
        }while (minuto <= tiempoAtencion);




    }
    
}
