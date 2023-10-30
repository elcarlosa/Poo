package _p120_Vehiculo;
public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Sedan miSedan = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println("Maquina ["+ miSedan.getNombre()+ ", Propietario "+ miSedan.getPropietario()+", Pasajeros "+ miSedan.getPasajeros()+"]");
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.reposar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println();

        Suv miSuv = new Suv("Mamalona", "elcarlos", 6);
        System.out.println("Maquina ["+ miSuv.getNombre()+", Propietario "+ miSuv.getPropietario()+ ", Pasajeros "+ miSuv.getPasajeros()+"]");
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.reposar();
        miSuv.arrancar();
        miSuv.frenar();
        System.out.println();
        }   
}
