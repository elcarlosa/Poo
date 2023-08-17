import java.util.Scanner;
public class _p04_PagaTrabajador{
    public static void main (String[] args){
        String nombre;
        int horas;
        double pago, pagabruta, tasa, impuesto, paganeta;
        Scanner obj = new Scanner(System.in);

        //lectura de datos 
        System.out.print("nombre:          : "); nombre = obj.nextLine();
        System.out.print("horas Trabajadas : "); horas = obj.nextInt();
        System.out.print("paga por hora    : "); pago = obj.nextFloat();
        tasa=0.3f;

        //calculo de datos
        pagabruta = horas * pago;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        //salida de datos
        System.out.print("la operacion del pago es: \n");
        System.out.println(String.format("el trabajador %s trabajo un total de %s horas con una paga de %.2f pesos la hora se asume una tasa de impuestos del %.2f",nombre,horas,pago,tasa));
        System.out.println(String.format("la paga bruta es: %.2f", pagabruta));
        System.out.println(String.format("impuesto:  %.2f",impuesto));
        System.out.println(String.format("la paga neta es: %.2f", paganeta));
    }
}