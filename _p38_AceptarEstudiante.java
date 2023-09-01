import java.util.Scanner;
public class _p38_AceptarEstudiante {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String nom;
        int e;
        char se;
        double c1, c2, c3, p;

        System.out.println("Hola, cual es tu nombre?"); nom = obj.nextLine();
        System.out.println("[H]ombre"); 
        System.out.println("[M]ujer");
        se = Character.toUpperCase(obj.next().charAt(0));

        if (se == 'M'){
            System.out.println("Dime tu edad"); e = obj.nextInt();
            if(e>=21){
                System.out.println("Dime las 3 calificaciones");
                System.out.println("1: ");c1 = obj.nextDouble();
                System.out.println("2: ");c2 = obj.nextDouble();
                System.out.println("3: ");c3 = obj.nextDouble();
                p = 3/(c1 + c2 + c3);
                if((p>8)&&(p<9.5)){
                    System.out.println("Felicidades estas aceptado #matriarcado #edadado #calificaciondado");
                }
                else{
                    System.out.println("Solo personas con una calificacion especifica #calificaciondado");
                }
            }
        else{
                System.out.println("No eres mayor de edad #edadado");
        }
        }
        else{
            System.out.println("No eres mujer no entras #matriarcado");
        }
    }
}
