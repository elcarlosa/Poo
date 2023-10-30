package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    public Sedan(String nombre, String Propietario, int pasajeros){
        super(nombre, Propietario, pasajeros);
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico es un Sedan");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automovil con combustion interna es un Sedan");
    }
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }
    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
}
