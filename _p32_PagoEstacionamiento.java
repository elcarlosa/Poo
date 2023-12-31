import java.util.Scanner;
public class _p32_PagoEstacionamiento {
    public static void main(String[] args) {
        int op;
        float tasa=0, pago=0, impuesto=0, total=0;
        String salida="";
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Administra el pago por estacionamiento de acuerdo a la zona\n");
        System.out.println("1 - Estacionamiento Tacuba 3%");
        System.out.println("2 - Estacionamiento Portales 5$");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos 15%");
        System.out.println("Elige opcion ? "); op = obj.nextInt();
        System.out.println("Pago efectuado ? "); pago = obj.nextFloat();
        switch (op) {
            case 1 : tasa = 0.03f;break;
            case 2 : tasa = 0.05f;break;
            case 3 : tasa = 0.10f;break;
            case 4 : tasa = 0.15f;break;
            default : System.out.println("Opcion Invalida !!!");break;
        }
        impuesto = pago * tasa;
        total = pago + impuesto;

        salida = String.format("\nElegiste el estacionamiento %d \n"+
        "pagaste %.2f por el tiempo de uso \n"+
        "corresponde un impuesto de %.2f\n" +
        "El pago total es de %.2f", op, pago, impuesto, total);
        System.out.println("\n\nProceso terminado ...");
    }
    
}
