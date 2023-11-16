package _p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> Datos = new ArrayList<>();
        Datos.add(new Jugador("Pablo", 17, 'H', "Solo", "Chido", 200.00));
        Datos.add(new Jugador("Messita", 80, 'H', "Juntao", "Eh?", 20000.00));
        return Datos;
    }

    public static void serializandoDatones(String archivo, ArrayList<Jugador> Datos) {
        try (ObjectOutputStream fpersonas = new ObjectOutputStream(new FileOutputStream(archivo))) {
            fpersonas.writeObject(Datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws ClassNotFoundException {
        ArrayList<Jugador> Datos = new ArrayList<>();
        try (ObjectInputStream fpersonas = new ObjectInputStream(new FileInputStream(archivo))) {
            Datos = (ArrayList<Jugador>) fpersonas.readObject();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return Datos;
    }
}
