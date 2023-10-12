import java.util.Scanner;

public class _p91_MayoresAlPromedio {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int c=0,u;
        double P, S=0;
        double[] n={};
        System.out.println("Cuantos datos desea añadir?");u=obj.nextInt();
        for (int i = 0; i <=u; i++) {
            System.out.println("Dato numero"+i);n[i]=obj.nextDouble();
            S = S+n[i];       
        }
        P=S/u;
        System.out.println("El promedio es: "+P);
        for (int i = 0; i < n.length; i++) {
            if(n[i]>=P){
                c++;
                System.out.println(n[i]);
            }
        System.out.println("La cantidad de datos mayores al promedio son: "+c);
        }
    }
}
