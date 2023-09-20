import java.util.Scanner;

public class _p66_ConversionTemperaturas {
    public static float Farenheit(float t){
        float r;
        r = (t=95)
    }    public static void main(String[] args) {
        int op;
        float temp=0, res=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("[1] Farenheit\n[2] Centigrados\nElige ? "); op= obj.nextInt();
        switch(op){
            case 1:
                System.out.print("Convertir a farenheit\nDame la temperatura ? "); temp = obj.nextFloat();
                res = farenheit(temp);
                System.out.printf("La temperatura %2f en grados celcius equivale a %.2f grados farenheit", temp, res)
                break;
            case 2:
                System.out.print("Convertir a farenheit\nDame la temperatura ? "); temp = obj.nextFloat();
                res = farenheit(temp);
                System.out.printf("La temperatura %2f en grados celcius equivale a %.2f grados farenheit", temp, res)
                break;

        }
    }
}
