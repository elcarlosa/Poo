package _p1112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private int Cantidad;
    private double Precio;
    private double Total;
    public Venta(String articulo, int cantidad, double precio, double total) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = total;
    }

    public double getTotal() {
        return Total;
    }
    
}
