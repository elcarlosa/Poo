package _p120_Vehiculo;

public class Maquina {
    private String Nombre, Propietario;
    private int Pasajeros;
    public Maquina(String nombre,String propietario, int pasajeros){
        Nombre = nombre;
        Propietario=propietario;
        Pasajeros=pasajeros;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getPropietario() {
        return Propietario;
    }
    public int getPasajeros() {
        return Pasajeros;
    }
    public void reposar(){
        System.out.println("Repostando...");
    }
    public void arrancar(){
        System.out.println("Arrancando...");
    }
    public void frenar(){
        System.out.println("Frenando...");
    }
    ///reposar arrancar frenar 
}
