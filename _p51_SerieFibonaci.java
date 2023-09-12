import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
         int sum, cont, num, resp, lim;
        Scanner obj = new Scanner(System.in);
        do {
            cont=1;
            num = 1;
            sum = 0;
            System.out.print("Escribe la cantidad de numeros que desea: ");lim = obj.nextInt();
            do{
                System.out.println(sum);
                sum = sum + num;
                System.out.println(num);
                num = sum + num;
                cont = cont +1;
            }while(cont < lim);
            System.out.print("\nSi desea continuar presiones 1 si no presiona cualquier otro: ");resp = obj.nextInt();
        } while (resp == 1);
    }
}
