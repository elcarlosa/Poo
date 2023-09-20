import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Escribe un numero"); c=obj.nextInt();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
