package _p105_PuntoTriangulo;

class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistancia(Punto punto) {
        int dx = punto.getX() - this.x;
        int dy = punto.getY() - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}
