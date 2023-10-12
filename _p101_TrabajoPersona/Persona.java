package _p101_TrabajoPersona;

public class Persona {
    private String nombre;
    private Trabajo Trabajo;
    
    public Persona() {
    }
    public Persona(String nombre, _p101_TrabajoPersona.Trabajo trabajo) {
        this.nombre = nombre;
        Trabajo = trabajo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Trabajo getTrabajo() {
        return Trabajo;
    }
    public void setTrabajo(Trabajo trabajo) {
        Trabajo = trabajo;
    }
    @Override
    public String toString(){
        return "Persona [Nombre=" + Nombre + ", Trabajo=" + Trabajo + "]";
    }
}
