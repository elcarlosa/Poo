import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea capturar: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nElementos del arreglo:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int mayor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        int menor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}

