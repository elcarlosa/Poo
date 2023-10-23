package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Compacto(4, 2, "CP0100010122", "Ford", 2023, 125345.22),
            new Compacto(6, 4, "CP1000145555", "Nissan", 2010, 54500.33),
            new Camioneta(450.0, 4, "CA104014544", "Dina", 2008, 234567.15),
            new Camioneta(1200.0, 6, "CA774814599", "Hongyan", 2023, 934577.98)
        };

        System.out.println("Datos de los Vehiculos de la flota");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        double totalPrecio = 0;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getPrecio());
            totalPrecio += vehiculo.getPrecio();
        }
        System.out.println("La suma de precios es: " + totalPrecio);
    }
}