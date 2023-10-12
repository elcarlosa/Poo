package _p94_Empleado01;

public class app {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.nombre="Juan Perez";
        empleado.edad=35;

        System.out.println(empleado.nombre);
        System.out.println(empleado.edad);

        Empleado empleado2 = new Empleado();
        empleado2.nombre="Maria";
        empleado2.edad=50;
    }
}
