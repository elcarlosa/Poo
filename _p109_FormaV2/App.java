package _p109_FormaV2;

public class App {
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(10.23, "Rojo", true),
            new Circulo(99.12, "Verde", false),
            new Rectangulo(10.0, 20.0, "Amarillo", false),
            new Rectangulo(15.0, 44.0, "Azul", true)
        };

        System.out.println("Todas las formas:");
        for (Forma forma : formas) {
            System.out.println(forma.toString());
        }

        System.out.println("\nCalculando áreas y perímetros de las figuras:");
        for (Forma forma : formas) {
            System.out.println("La forma es un " + forma.getClass().getSimpleName());
            System.out.println("El área es : " + forma.getArea());
            System.out.println("El perímetro es : " + forma.getPerimetro());
        }
    }
}
