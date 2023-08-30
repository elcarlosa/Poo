import java.util.Scanner;

public class _p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Escribe el numero que quieras verificar");
        int num = new Scanner(System.in).nextInt();

        if (num > 0)
            System.out.println("el numero es positivo");
        if (num < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es igual a 0");
        }
    }
}
