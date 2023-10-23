    import java.util.Random;
public class _p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100; // Tamaño máximo del arreglo
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        int cuentaPares = 0;
        int cuentaImpares = 0;

        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21); 
        }

        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nElementos pares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                cuentaPares++;
            }
        }
        System.out.println("\nElementos impares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                cuentaImpares++;
            }
        }

        System.out.println("\nCantidad de elementos pares: " + cuentaPares);
        System.out.println("Cantidad de elementos impares: " + cuentaImpares);
    }
}

