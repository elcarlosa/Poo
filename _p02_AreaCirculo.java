//calcula el area de un circulo
//Se importa la herramienta que nos permitira leer texto 
import java.util.Scanner;
public class _p02_AreaCirculo {
    //lo siguiente es la instruccion para correr el programa
    public static void main (String[] args){
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.print("Escribe el radio del circulo: ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El radio del circulo " + radio + " es: " + area);

    }
    
}
