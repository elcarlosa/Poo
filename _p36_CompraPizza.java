import java.util.Scanner;
public class _p36_CompraPizza {
    public static void main(String[] args) {
        int pn, cp;
        double cd, c1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Si desea una Pizza chicha escriba 1, si desea una mediana escriba 2 y si desea una grande escriba 3");
        pn = obj.nextInt();
        if (pn == 1){
            System.out.println("Cuantas pizzas chicas desea?"); cp= obj.nextInt();
            c1 = cp *5;
            if(c1<2000){
                cd = c1;
                System.out.printf("\nEl tamaño de su compra es chico\ncompro una cantidad total de %d pizzas\n El total a pagar es: %.2f sin descuento", cp);
            }
            else if(c1>=2000){
                cd = c1-(c1 * 0.15);
                System.out.printf("\nEl tamaño de su compra es chico\ncompro una cantidad total de %d pizzas\nEl total es de %f, con un descuento del 15 porciento", cp, cd);
            } 
        }
        else if(pn == 2){
            System.out.println("Cuantas pizzas medianas desea?"); cp= obj.nextInt();
            c1 = cp*10;
            if(c1<2000){
                cd = c1;
                System.out.printf("\nEl tamaño de su compra es chico\ncompro una cantidad total de %d pizzas\n El total a pagar es: %.2f sin descuento", cp, cd);
            }
            else if(c1>=2000){
                cd = c1-(c1 * 0.15);
                System.out.printf("\nEl tamaño de su compra es chico\ncompro una cantidad total de %d pizzas\nEl total es de %f, con un descuento del 15 porciento", cp, cd);
            }    
        }
        else if(pn == 3){
            System.out.println("Cuantas pizzas grandes desea?"); cp= obj.nextInt();
            c1 = cp*20;
            if(c1<2000){
                cd = c1;
            System.out.printf("\nEl tamaño de su compra es chico\ncompro una cantidad total de %d pizzas\n El total a pagar es: %.2f sin descuento", cp, cd);
            }
            else if(c1>=2000){
                cd = c1-(c1 * 0.15);
                System.out.printf("\nEl tamaño de su compra es chico\ncompro una cantidad total de %d pizzas\nEl total es de %f, con un descuento del 15 porciento", cp, cd);
            }  
        }
    }
}
