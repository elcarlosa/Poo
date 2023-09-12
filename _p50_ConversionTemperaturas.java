import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int ini, fin, resp;
        double far;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("Escribe el inicio de los grados centigrados: ");ini = obj.nextInt();
            System.out.printf("\nEscribe el fin de los grados centigrados: "); fin = obj.nextInt();
            if(ini < fin){
                while (ini <= fin) {
                far = ((ini * (1.8))+32);
                System.out.print("\nCentigrados: "+ ini);
                System.out.print(" Farenheit: "+ far);
                ini = ini + 1;
                }
            }
            else{
                System.out.println("Escriba valores validos");
            }
            System.out.print("\nSi desea continuar presiones 1 si no presiona cualquier otro: ");resp = obj.nextInt();
        } while (resp == 1);
    }
}

