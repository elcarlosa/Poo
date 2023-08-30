import java.util.Scanner;
public class _p22_VerificarSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dime el valor del primer numero");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Escribe el 2do numero: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Escribe el 3er valor: ");
        int num3 = new Scanner(System.in).nextInt();

        if((num1+num2)==num3){
            System.out.println("son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
        }
}
