import java.util.Scanner;
public class _p34_NumeroMayor {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Escribe el primer numero: "); num1 = obj.nextDouble();
        System.out.println("Escribe el segundo numero: "); num2 = obj.nextDouble();
        System.out.println("Escribe el tercer numero: "); num3 = obj.nextDouble();

        if((num1>num2)||(num3>num2)){
            if(num1>num3){
                System.out.printf("\nEl numero mayor es el: "+ num1);
            }
            else if(num3>num1){
                System.out.printf("\nEl numero mayor es el: "+ num3);
            }
        }
        else{
            System.out.printf("El numero mayor es el: "+ num2);
        }
    }
}
