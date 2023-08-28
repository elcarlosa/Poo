import java.util.Scanner;
public class _p13_VolumenCilindro {
    public static void main(String[] args){
        double radio, altura, volumen;

        System.out.println("Dame el radio del cilindro: ");
        radio = new Scanner(System.in).nextDouble();
        System.out.println("Dame la altura del cilindro: ");
        altura = new Scanner(System.in).nextDouble();

        volumen = Math.PI * (radio * radio) * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
