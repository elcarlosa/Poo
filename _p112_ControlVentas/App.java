package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda miTienda = new Tienda("Mi Tienda", "Propietario", "Domicilio de la Tienda");

        Cliente cliente1 = new Cliente("Cliente 1", "Domicilio Cliente 1", "correo1@example.com");
        Cliente cliente2 = new Cliente("Cliente 2", "Domicilio Cliente 2", "correo2@example.com");

        Articulo articulo1 = new Articulo("Articulo 1", 10.0);
        Articulo articulo2 = new Articulo("Articulo 2", 15.0);
        Cantidad cantidad1 = new Cantidad(3);
        Cantidad cantidad2 = new Cantidad(2);
        Precio precio1 = new Precio(10.0);
        Precio precio2 = new Precio(15.0);
        Descuento descuento1 = new Descuento(5.0);
        Descuento descuento2 = new Descuento(2.0);
        Regalo regalo1 = new Regalo(2.0);
        Regalo regalo2 = new Regalo(1.0);
        VentaContado ventaContado1 = new VentaContado(articulo1, cantidad1, precio1, descuento1, regalo1);
        VentaContado ventaContado2 = new VentaContado(articulo2, cantidad2, precio2, descuento2, regalo2);
        VentaCredito ventaCredito1 = new VentaCredito(articulo1, cantidad1, precio1, 6, 2.0);
        VentaCredito ventaCredito2 = new VentaCredito(articulo2, cantidad2, precio2, 3, 1.5);

        cliente1.agregarVenta(ventaContado1);
        cliente1.agregarVenta(ventaCredito1);
        cliente2.agregarVenta(ventaContado2);
        cliente2.agregarVenta(ventaCredito2);

        
        miTienda.agregarCliente(cliente1);
        miTienda.agregarCliente(cliente2);

        miTienda.reporte();
    }
}
