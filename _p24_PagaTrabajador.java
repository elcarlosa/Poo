import java.util.Scanner;
public class _p24_PagaTrabajador {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int horas, extr;
        float paga, total;
        Scanner obj = new Scanner(System.in);

        System.out.println("Horas trabajadas ? "); horas = obj.nextInt();
        System.out.println("Paga x hora      ?"); paga = obj.nextFloat();

        if( horas>40 ){
            extr = horas-40;
            total= 40 * paga + (2 * paga * extr);
        }
        else{
            total = horas * paga;
        }

        System.out.printf("\nHoras extra : %f", total);
        System.out.printf("El pago total es de %f", total); 
    }
    
}
