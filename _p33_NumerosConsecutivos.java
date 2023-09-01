import java.util.Scanner;
public class _p33_NumerosConsecutivos {
        public static void main(String[] args) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            int num1, num2, num3;
            Scanner obj = new Scanner(System.in);

            System.out.print("Escribe el primer numero"); num1 = obj.nextInt();
            System.out.print("Escribe el segundo numero: "); num2 = obj.nextInt();
            System.out.print("Escribe el tercer numero: "); num3 = obj.nextInt();

            if ((num1 + 1 == num2)&&(num2 + 1 == num3)){
                System.out.printf("\nLos numeros son consecutivos");
            }
            else{
                System.out.println("Los numeros no son consecutivos");
            }
    }
    
}

