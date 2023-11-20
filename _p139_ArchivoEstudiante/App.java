package _p139_ArchivoEstudiante;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.println("Ingrese los datos del estudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            estudiantes[i] = new Estudiante(nombre, edad, promedio, sexo);
        }

        Estudiante.escribirEnArchivo(estudiantes);

        Estudiante[] estudiantesLeidos = Estudiante.leerArchivo();

        System.out.println("\nLista de estudiantes leída del archivo:");
        for (Estudiante estudiante : estudiantesLeidos) {
            System.out.println("Nombre: " + estudiante.getNombre() +
                    ", Edad: " + estudiante.getEdad() +
                    ", Promedio: " + estudiante.getPromedio() +
                    ", Sexo: " + estudiante.getSexo());
        }

        double promedioCalificaciones = Estudiante.calcularPromedioCalificaciones(estudiantesLeidos);
        System.out.println("\nPromedio de calificaciones: " + promedioCalificaciones);

        double promedioEdades = Estudiante.calcularPromedioEdades(estudiantesLeidos);
        System.out.println("Promedio de edades: " + promedioEdades);

        int cantidadHombres = Estudiante.contarEstudiantesPorSexo(estudiantesLeidos, 'M');
        int cantidadMujeres = Estudiante.contarEstudiantesPorSexo(estudiantesLeidos, 'F');
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }
}

