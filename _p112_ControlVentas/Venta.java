package _p112_ControlVentas;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta Venta
abstract class Venta {
    protected Articulo articulo;
    protected Cantidad cantidad;
    protected Precio precio;

    public Venta(Articulo articulo, Cantidad cantidad, Precio precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public abstract double getTotalVenta();
}

class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

class Cantidad {
      private int cantidad;

    public Cantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}

class Precio {
        private double precio;

    public Precio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}

class Total {
    private double total;

    public Total(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}