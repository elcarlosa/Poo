package _p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private String EC;
    private String Desc;
    private Double Salario;

    public Jugador() {}

    public Jugador(String nombre, int edad, char sexo, String eC, String desc, Double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EC = eC;
        Desc = desc;
        Salario = salario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public Character getSexo() {
        return Sexo;
    }
    public void setSexo(Character sexo) {
        Sexo = sexo;
    }
    public String getEC() {
        return EC;
    }
    public void setEC(String eC) {
        EC = eC;
    }
    public String getDesc() {
        return Desc;
    }
    public void setDesc(String desc) {
        Desc = desc;
    }
    public Double getSalario() {
        return Salario;
    }
    public void setSalario(Double salario) {
        Salario = salario;
    }
    
}
