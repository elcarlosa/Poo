import java.util.Scanner;
public class _p23_ConvertirTemperatura2 {
    public static void main(String[] args) {
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.println("[F] arenheit a centigrados");
        System.out.println("[C] entigrados a Fahtenheit");
        System.out.println("eliga la opcion que desea");
        op = obj.next().charAt(0);

        if(op=='F'){
            System.out.println("Escribe la cantidad de grados que desea coonvertir");
            temp = obj.nextFloat();
            res = ( temp - 32) * 5 / 9;
            System.out.printf("\n%f grados fahrenheit equivale a %f grados centigrados",temp,res);
        }
        else{
            System.out.println("Escribe la cantidad de grados que desea convertir");
            temp = obj.nextFloat();
            res = ( temp * 9 / 5) + 32;
            System.out.printf("\n%f grados centigrados equivale a %f grados fahrenheit",temp,res);
        }
    }
}
