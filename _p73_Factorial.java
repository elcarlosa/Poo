import java.util.Scanner;

public class _p73_Factorial {
    public static double Factorial(int n){
        double f=1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame un numero");
        int n = new Scanner(System.in).nextInt();

        System.out.printf("\nEl factorial es %d es %.0f", n, Factorial(n))
    }
    
}
