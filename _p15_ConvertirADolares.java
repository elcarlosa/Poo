import java.util.Scanner;
public class _p15_ConvertirADolares {
    public static void main(String[] args){
        double pesos, dolares;

        System.out.println("Escribe la cantidad de pesos a convertir: ");
        pesos = new Scanner(System.in).nextDouble();

        dolares = pesos * 0.060;

        System.out.println("El resultado de la conversion es: "+ dolares);
    }
    
}
