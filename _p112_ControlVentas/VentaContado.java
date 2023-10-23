package _p112_ControlVentas;

class VentaContado extends Venta {
    private Descuento descuento;
    private Regalo regalo;

    public VentaContado(Articulo articulo, Cantidad cantidad, Precio precio, Descuento descuento, Regalo regalo) {
        super(articulo, cantidad, precio);
        this.descuento = descuento;
        this.regalo = regalo;
    }

    public double getTotalVenta() {
        double total = this.cantidad.getCantidad() * this.precio.getPrecio();
        total -= this.descuento.getDescuento();
        total += this.regalo.getRegalo();
        return total;
    }
}

class Descuento {
    private double descuento;

    public Descuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}

class Regalo {
    private double regalo;

    public Regalo(double regalo) {
        this.regalo = regalo;
    }

    public double getRegalo() {
        return regalo;
    }
}