class  Ejemplo{
    public static void main (String[] args){

        System.out.println("Hola mundo");
        System.out.println(5);
        System.out.println(5+5);
        System.out.println("5+5");
        System.out.println("5+5="+5+5);

        int edad;
        edad = 7+3;

        final int MESES_DEL_AÑO = 12;

        int edadEnMeses = edad * MESES_DEL_AÑO;

        final int DIAS_DEL_AÑO = 365;
        final int DIAS_DEL_MES = 30;
        int edadEnDias = edad * MESES_DEL_AÑO * DIAS_DEL_MES;
        int edadEnAños = edad * DIAS_DEL_AÑO;

        System.out.println("Edad en años: " + edadEnAños);
        System.out.println("Edad en dias: " + edadEnDias);
        System.out.println("Edad en meses:" + edadEnMeses);
    }

}