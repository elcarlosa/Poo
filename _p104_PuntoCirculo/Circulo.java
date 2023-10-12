package _p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private Double Radio;
    private Double Area;
    public Circulo() {
    }
    public Circulo(Double radio) {
        Radio = radio;
    }
    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public Double getRadio() {
        return Radio;
    }
    public void setRadio(Double radio) {
        Radio = radio;
    }
    public Double getArea(){
        return Area;
    }
    
}
