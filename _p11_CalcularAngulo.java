import java.util.Scanner;
public class _p11_CalcularAngulo {
    public static void main(String[] args){
        double angulo1, angulo2, angulo3;

        System.out.println("Escribe el valor del angulo 1: ");
        angulo1 = new Scanner(System.in).nextDouble();
        System.out.println("Escrible el valor del angulo 2: ");
        angulo2 = new Scanner(System.in).nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("El valor del 3er angulo es:"+ angulo3);
    }   
    
}
