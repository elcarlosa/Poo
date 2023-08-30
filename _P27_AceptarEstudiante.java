import java.util.Scanner;

public class _P27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        float c1,c2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");

        System.out.print("Dame tu nombre ? "); nombre = obj.nextLine();
        System.out.print("Dame la edad ? "); edad = obj.nextInt();

        if( edad >= 18){
            System.out.println("Eres mayor de edad, continuamos");
            System.out.println("Dame dos calificaciones separadas por Enter:");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();
            if( c1>= 8 && c2 >= 8){
                System.out.printf("\nBienvenido %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,c1,c2);
            }
            else
                 System.out.println("\nSolo aceptamos estudiantes con calificacion de 8 en delante");
        }
        else
                 System.out.println("Solo aceptamos mayores a 18 de edad");
        System.out.println("\nProceso terminado ...");
    }
    
}
