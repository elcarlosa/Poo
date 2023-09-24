import java.util.Scanner;

public class _p76_DiaSemana {
    public static void Semana(int dia){
        String let= "";
        switch (dia) {
            case 1:
                let="Lunes";
                break;
        
            case 2:
                let="Martes";
                break;
            case 3:
                let="Miercoles";
                break;
            case 4:
                let="Jueves";
                break;
            case 5:
                let="Viernes";
                break;
            case 6:
                let="Sabado";
                break;
            case 7:
                let="Domingo";
                break;
            default:
                System.out.println("Opcion invalida");
        System.out.printf("El resultado es:", let);
        }
    }
    public static void main(String[] args) {
        int dia=0;
        Scanner obj = new Scanner(System.in);
        do{
            System.out.println("Escribe por NUMERO un dia de la semana");dia = obj.nextInt();
            if(dia<=0||dia>7){
                System.out.println("El dia no es valido, intente de nuevo");
            }
        }while(dia<=0||dia>7);
        Semana(dia);
    }
}
