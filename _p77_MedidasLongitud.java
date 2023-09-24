import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static void centimetros(double p){
        double c=0;
        c=p*2.56;
        System.out.printf("La cantidad de %.2d convertida a centimetros es un total a %.2d",p,c);
    }
    public static void pies(double m){
        double p=0;
        p=m*3.281;
        System.out.printf("La cantidad %.2d convertida es un total de %.2d pies", m,p);
    }
    public static void main(String[] args) {
        double p, m;
        char O;
        Scanner obj = new Scanner(System.in);
        System.out.println("Escriba C si desea convertir a centimetros o escriba P si desea pulgadas");
        O = Character.toUpperCase(obj.next().charAt(0));
        if (O=='C'){
            System.out.println("Dime cuantas pulgadas tengo que convertir");p= obj.nextDouble();
            centimetros(p);
        }
        else if(O=='m'){
            System.out.println("Escriba la cantidad de metros que desea convertir");m = obj.nextDouble();
            pies(m);
        }
    }
}
