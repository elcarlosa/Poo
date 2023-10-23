package _p98_Circulo;

public class Circulo {

    private double radio;

    public Circulo() {
        this.radio = 0.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return "Círculo [Radio=" + this.radio + "]";
    }
}
