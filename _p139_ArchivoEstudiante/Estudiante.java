package _p139_ArchivoEstudiante;

import java.io.*;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private char sexo;

    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public char getSexo() {
        return sexo;
    }

    public static void escribirEnArchivo(Estudiante[] estudiantes) {
        try (PrintWriter escritor = new PrintWriter("estudiantes.txt")) {
            for (Estudiante estudiante : estudiantes) {
                escritor.println(estudiante.getNombre() + "," +
                        estudiante.getEdad() + "," +
                        estudiante.getPromedio() + "," +
                        estudiante.getSexo());
            }
            System.out.println("\nLos datos han sido escritos correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static Estudiante[] leerArchivo() {
        try (BufferedReader lector = new BufferedReader(new FileReader("estudiantes.txt"))) {
            int cantidadEstudiantes = (int) lector.lines().count();
            Estudiante[] estudiantesLeidos = new Estudiante[cantidadEstudiantes];

            lector.close(); // Se cierra y vuelve a abrir para reiniciar el flujo

            lector.lines().forEach(linea -> {
                String[] partes = linea.split(",");
                String nombre = partes[0];
                int edad = Integer.parseInt(partes[1]);
                double promedio = Double.parseDouble(partes[2]);
                char sexo = partes[3].charAt(0);

                estudiantesLeidos[0] = new Estudiante(nombre, edad, promedio, sexo);
            });

            return estudiantesLeidos;
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return new Estudiante[0]; // Devuelve un arreglo vacío si hay un error
        }
    }

    public static double calcularPromedioCalificaciones(Estudiante[] estudiantes) {
        double sumaCalificaciones = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaCalificaciones += estudiante.getPromedio();
        }
        return sumaCalificaciones / estudiantes.length;
    }

    public static double calcularPromedioEdades(Estudiante[] estudiantes) {
        double sumaEdades = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaEdades += estudiante.getEdad();
        }
        return sumaEdades / estudiantes.length;
    }

    public static int contarEstudiantesPorSexo(Estudiante[] estudiantes, char sexoBuscado) {
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo() == sexoBuscado) {
                contador++;
            }
        }
        return contador;
    }
}