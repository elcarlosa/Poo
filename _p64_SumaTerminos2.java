import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Dime un numero"); n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            int term = Integer.parseInt(new String(new char[i]).replace("\0", "1"));
            sum += term;
            if (i == n) {
                System.out.print(term);
            } else {
                System.out.print(term + "+");
            }
        }
        System.out.println("\nSuma " + sum);
    }
}
