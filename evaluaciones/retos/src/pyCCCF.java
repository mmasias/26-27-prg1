public class RetoCCCF {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    final double HORA_APERTURA = 9.0;
    final double HORA_CIERRE = 21.0;
    Final double MINUTO = 1.0 / 60.0;
    double horaActual = HORA_APERTURA;
    boolean estaAbierto = true;
    
    int cola = 0;
    final double PROBABILIDAD_LLEGADA = 0.6;

    INT caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;
    final int ITEMS_MINIMO = 5;
    final int ITEMS_MAXIMO = 15;
    boolean hallegado;

    final int MINUTOS_POR_HORA =60;
    final int PRIMER_NUMERO_DOS_CIFRAS = 10;
    int minutosSinCola = 0;
    int personasAtendidas = 0
    int itemsVendidos = 0;

    do {
        horaActual = horaActual + MINUTO;
        estaAbierto = horaActual < HORA_CIERRE;
        hallegado = false;
        if (Math.random() < PROBABILIDAD_LLEGADA) {
            cola++;
            hallegado = true;
        }
        if (cola < 0 && caja1 <= 0) {
            cola--;
            caja1 = crearItems(ITEMS_MAXIMO, ITEMS_MINIMO);
        }
        if (cola < 0 && caja2 <= 0) {
        }
        if (cola < 0 && caja3 <= 0) {
            cola--;
            caja3 = crearItems(ITEMS_MAXIMO, ITEMS_MINIMO);
        }
        if (cola < 0 && caja4 <= 0) {}
        }
        

