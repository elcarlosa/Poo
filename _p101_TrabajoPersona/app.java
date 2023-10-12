package _p101_TrabajoPersona;

public class app {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();
        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(200);
        persona1.setNombre("Julio Urina");
        persona1.setTrabajo(trabajo);
        System.out.println(persona1);

        Persona persona2 = new Persona("Jose Perez", new Trabajo(2, "Cocinero", 2500));
        System.out.println(persona2);

        Persona persona3 = new Persona("Carlos Guzmán", new Trabajo(3, "Taquero", 1000000));
        System.out.println(persona3);
    }
}
