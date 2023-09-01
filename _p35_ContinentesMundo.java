import java.util.Scanner;
public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        int continente;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Escribe el numero de la estacion que desea:"); continente = obj.nextInt();

        switch (continente){
            case 1: System.out.println("Asia"); break;
            case 2: System.out.println("Africa"); break;
            case 3: System.out.println("America del norte"); break;
            case 4: System.out.println("America del sur"); break;
            case 5: System.out.println("Antartida"); break;
            case 6: System.out.println("Europa"); break;
            default: System.out.println("Error el numero no coincide con ningun continente"); break;
        }
        System.out.println("Proceso terminado");

    }
}
