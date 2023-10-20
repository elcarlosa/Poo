package _p110_CuentaBancaria;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    public Banco(){
        Clientes = new ArrayList<>();
    }

    public Banco(String nombre, String domicilio){
        this();
              Nombre = nombre;
              Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente){
        Clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes(){
        return Clientes;
    }
    @Override
    public String toString(){
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + 
        Domicilio +", Cliente=" + Clientes.size() + "]";
    }
}
