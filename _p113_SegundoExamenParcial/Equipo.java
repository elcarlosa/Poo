package _p113_SegundoExamenParcial;

import java.util.ArrayList;
public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("Reporte del Equipo " + Nombre + " - " + Liga);
        System.out.println("Total de jugadores: " + Jugadores.size());
        System.out.println("Total de hombres: " + getTotalH());
        System.out.println("Total de mujeres: " + getTotalM());
        System.out.println("Total del bono: " + getTotalBono());
        System.out.println("Total del equipo: " + getTotal());
    }

    @Override
    public String toString() {
        return "Nombre del equipo: " + Nombre + ", Liga: " + Liga;
    }
}