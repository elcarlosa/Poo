package _p113_SegundoExamenParcial;

abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected String Descripcion;
    public double Salario;
    public double total;
    public Jugador() {
    }
    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Descripcion = descripcion;
        this.Salario = salario;
    }
    public abstract double getBono();
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    @Override
    public String toString(){
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion +", Salario=" + Salario + "]";
    }
}
