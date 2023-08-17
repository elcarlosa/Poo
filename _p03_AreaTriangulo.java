import java.util.Scanner;
public class _p03_AreaTriangulo {
    public static void main (String[] args){
        //asi se declaran variables
        int base, altura;
        double area;
        //asi se llama al objeto que es capaz de leer
        Scanner obj = new Scanner(System.in);

        System.out.print("Dime la base del triangulo: ");
        //asi se leen de teclado 
        base = obj.nextInt();
        System.out.print("Dime el valor de la altura: ");
        altura = obj.nextInt();

        area = (base * altura)/2;
        System.out.println("El area del triangulo con base: " + base + " y con una altura de: " + altura + " tiene un area de: " + area);
    }
    }