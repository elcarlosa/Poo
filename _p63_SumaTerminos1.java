import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        double sum = 0.0;
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Dame un numero"); n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
            if (i == n) {
                System.out.print("1/" + i);
            } else {
                System.out.print("1/" + i + "+");
            }
        }
        System.out.println("\nSuma " + Math.round(sum * 1000000000.0) / 1000000000.0);   
    }
}
