package _p112_ControlVentas;

class VentaCredito extends Venta {
    private int meses;
    private double interes;

    public VentaCredito(Articulo articulo, Cantidad cantidad, Precio precio, int meses, double interes) {
        super(articulo, cantidad, precio);
        this.meses = meses;
        this.interes = interes;
    }

    @Override
    public double getTotalVenta() {
        return this.cantidad.getCantidad() * this.precio.getPrecio() + this.meses * this.interes;
    }
}
