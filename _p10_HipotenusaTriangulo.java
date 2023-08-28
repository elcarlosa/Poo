import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args){
        int lL1, lL2;
        double hipotenusa;

        System.out.println("Escribe el valor del primer lado: ");
        lL1 = new Scanner(System.in).nextInt();
        System.out.println("Escribe el valor del segundo lado: ");
        lL2 = new Scanner(System.in).nextInt();

        hipotenusa = Math.sqrt((lL1*lL1)+(lL2*lL2));
        System.out.println("El valor de la hipotenusa es: "+ hipotenusa);
    }
}