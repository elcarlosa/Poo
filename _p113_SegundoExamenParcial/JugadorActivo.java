package _p113_SegundoExamenParcial;

abstract class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }

    @Override
    public double getBono() {
        return (getSalario() * 0.10) + (Partidos * 50) + (Goles * 5);
    }

    @Override
    public String toString() {
        return super.toString() + ", Partidos: " + Partidos + ", Goles: " + Goles;
    }
}
