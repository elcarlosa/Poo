import java.util.Scanner;
public class _p12_ConvertirTemperatura {
    public static void main(String[] args){
        double celsius, fahrenheit;
        System.out.println("Dame los grados Fahrenheit:");
        fahrenheit = new Scanner(System.in).nextDouble();

        celsius = (fahrenheit - 32) * (5/9);

        System.out.println("El resultado de la conversion es: " + celsius);
    }
    
}
