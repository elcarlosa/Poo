package _p112_ControlVentas;

import java.util.List;
import java.util.ArrayList;
class Tienda {
    private String nombre;
    private String propietario;
    private String domicilio;
    private List<Cliente> clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.domicilio = domicilio;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public double getTotal() {
        double total = 0;
        for (Cliente cliente : clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    public void reporte() {
        System.out.println("Datos de la tienda:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Propietario: " + propietario);
        System.out.println("Domicilio: " + domicilio);

        System.out.println("\nReporte de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
            System.out.println("Ventas realizadas:");

            for (Venta venta : cliente.ventas) {
                System.out.println("Artículo: " + venta.articulo.toString() + ", Cantidad: " + venta.cantidad.getCantidad() + ", Precio: " + venta.precio.getPrecio() + ", Total: " + venta.getTotalVenta());
            }
        }

        System.out.println("\nTotal de ventas de la tienda: " + getTotal());
    }

    @Override
    public String toString() {
        return "Tienda [Nombre=" + nombre + ", Propietario=" + propietario + ", Domicilio=" + domicilio + "]";
    }
}