package _p99_Rectangulo;

public class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo() {
        this.largo = 0.0f;
        this.ancho = 0.0f;
    }

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getLargo() {
        return this.largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return this.ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return this.largo * this.ancho;
    }

    public float getPerimetro() {
        return 2 * (this.largo + this.ancho);
    }

    @Override
    public String toString() {
        return "Rectángulo [Largo=" + this.largo + ", Ancho=" + this.ancho + "]";
    }
}

