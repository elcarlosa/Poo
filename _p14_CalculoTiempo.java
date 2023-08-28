import java.util.Scanner;
public class _p14_CalculoTiempo {
    public static void main(String[] args){
        double horas, dias, minutos, segundos;

        System.out.println("Dime la cantidad de horas: ");
        horas = new Scanner(System.in).nextDouble();

        dias = horas / 24;
        minutos = horas * 60;
        segundos = minutos * 60;

        System.out.println("La cantidad de horas son: "+ horas);
        System.out.println("\nLa cantidad de dias son:" + dias);
        System.out.println("\nLa cantidad de minutos son:" + minutos);
        System.out.println("\nLa cantidad de segundos son:" + segundos);
    }
    
}
