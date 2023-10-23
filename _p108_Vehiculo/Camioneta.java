package _p108_Vehiculo;

class Camioneta extends Vehiculo {
    private double capacidad;
    private int ejes;

    public Camioneta() {}

    public Camioneta(double capacidad, int ejes, String serie, String marca, int año, double precio) {
        super(serie, marca, año, precio);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + ", Capacidad=" + capacidad + ", Ejes=" + ejes + "]";
    }
}
