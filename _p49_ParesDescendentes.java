import java.util.Scanner;

public class _p49_ParesDescendentes {
    public static void main(String[] args) {
        int sp, prom, sum, cont, lim, resp;
       
        Scanner obj = new Scanner(System.in);
        do {
            sp = 0;
            cont = 100;
            sum = 0;
            System.out.println("\nDame el limite de los numeros impares"); lim = obj.nextInt();
            while (lim <= cont) { 
                if (cont % 2 == 0){
                    sp = sp + 1;
                    System.out.println("Numero par: "+ cont);
                    sum = sum + cont;
                }           
                cont = cont - 1;
            }
            System.out.println("La suma es: "+ sum);
            prom = sum / sp;
            System.out.println("El promedio es: "+prom);
            System.out.print("\nSi desea continuar presiones 1 si no presiona cualquier otro: ");resp = obj.nextInt();
        } while (resp == 1);
    }
}
