import java.util.Scanner;

public class _p75_Funciones {
    public static int Numeros(int n1,int n2,int n3,int n4){
        int r=0;
        if(n1>n2||n3>n4){
            if(n1>n3){
                r=n4;
            }
            else
                r = n3;
        }
        else if (n2>n1||n4>n3){
            if(n2>n4){
                r = n2;
            }
            else{
                r = n4;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);
        System.out.println("Dame el 1er numero");n1 = obj.nextInt();
        System.out.println("Dame el 2do numero");n2 = obj.nextInt();
        System.out.println("Dame el 3er numero");n3 = obj.nextInt();
        System.out.println("Dame el 4to numero");n4 = obj.nextInt();
        System.out.printf("El numero mas grande es: ",Numeros(n1, n2, n3, n4));
    }
}

