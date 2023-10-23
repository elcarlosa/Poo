package _p112_ControlVentas;
import java.util.List;
import java.util.ArrayList;

class Cliente {
    private String nombre;
    private String domicilio;
    private String correo;
    public List<Venta> ventas;

    public Cliente(String nombre, String domicilio, String correo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        this.ventas.add(venta);
    }

    public double getTotal() {
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + nombre + ", Domicilio=" + domicilio + ", Correo=" + correo + "]";
    }
}

