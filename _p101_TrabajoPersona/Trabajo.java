package _p101_TrabajoPersona;

import javax.management.relation.Role;

public class Trabajo {
    private int Id;
    private String rol;
    private double Salario;

    public Trabajo() {
    }
    public Trabajo(int id, String rol, double salario) {
        Id = id;
        this.rol = rol;
        Salario = salario;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }
@Override
public String toString() {
    return "Trabajo [Id=" + Id + ", Rol=" + Rol + ",Salario"+ Salario + "]";
}    
}   
