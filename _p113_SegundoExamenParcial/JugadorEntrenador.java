package _p113_SegundoExamenParcial;

abstract class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    @Override
    public double getBono() {
        return (getSalario() * 0.15) + (Proyectos * 100) + (Subordinados * 10);
    }

    @Override
    public String toString() {
        return super.toString() + ", Subordinados: " + Subordinados + ", Proyectos: " + Proyectos;
    }
}