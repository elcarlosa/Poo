package _p100_Articulo;

public class Articulo {
    private String id;
    private String desc;
    private int cant;
    private double precioUnit;

    public Articulo(String id, String desc, int cant, double precioUnit) {
        this.id = id;
        this.desc = desc;
        this.cant = cant;
        this.precioUnit = precioUnit;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getCant() {
        return this.cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecioUnit() {
        return this.precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getTotal() {
        return this.precioUnit * this.cant;
    }

    @Override
    public String toString() {
        return "Articulo [Id=" + this.id + ", Descripción=" + this.desc + ", Cantidad=" + this.cant +
                ", Precio Unitario=" + this.precioUnit + "]";
    }
}
