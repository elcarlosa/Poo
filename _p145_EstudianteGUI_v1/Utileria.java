package _p145_EstudianteGUI_v1;

import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Estudiante> inicializarDatos(){
    ArrayList<Estudiante> datos = new ArrayList<>();
    datos.add(new Estudiante("Juan Perez",22,34.5,"jperez@gmail.com"));
    datos.add(new Estudiante("Maria Jimenez",18,22.5,"mjimenez@gmail.com"));
    datos.add(new Estudiante("Pepe Toño", 45, 40, "elpepetoño@gmail.com"));
    return datos;
    }
}

