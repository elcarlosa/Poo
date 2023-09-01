import java.util.Scanner;
public class _p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int c1, c2, c3, c4, c5, cf;

        System.out.println("Escribe las 5 calificaciones a continuacion: ");
        System.out.println("1: "); c1 = obj.nextInt();
        System.out.println("2: "); c2 = obj.nextInt();
        System.out.println("3: "); c3 = obj.nextInt();
        System.out.println("4: "); c4 = obj.nextInt();
        System.out.println("5: "); c5 = obj.nextInt();
        cf = 5/(c1 + c2 + c3 + c4 + c5);

        if (cf <= 6){
            System.out.println("Estas reprobado");
        }
        else if(cf<=7){
            System.out.println("Pasas de panzazo");

        }
        else if(cf<=8){
            System.out.println("Muy bien, puedes mejorar");
        }
        else if(cf<=9){
            System.out.println("Exelente sigue asi");
        }
        else if(cf<=10){
            System.out.println("Perfecto tu esfuerzo valio la pena");
        }
    }
}
