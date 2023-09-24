import java.util.Scanner;

public class _p79_Angulo {
    public static void angulo(int a){
        if(a<90)
            System.out.print("El angulo es agudo");
        else if(a==90)
            System.out.print("El angulo es recto");
        else if(a>90 && a<180)
            System.out.print("El angulo es obtuso");
        else if(a==180)
            System.out.print("El angulo es llano");
        else if(a > 180 && a < 360)
            System.out.print("El angulo es concavo");
    }
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Escriba el angulo que desea conocer");a = obj.nextInt();
        if(a>0 && a<360){
            angulo(a);
        }
        else{
            System.out.println("Valor incorrecto");
        }

    }
    
}
