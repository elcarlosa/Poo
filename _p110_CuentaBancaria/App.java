package _p110_CuentaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("\nProbando clase CuentaBancaria:\n");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        cuenta1.deposito(10000);
        System.out.println("El saldo es " + cuenta1.getSaldo());
        double cretiro = 56;
        boolean retiro = cuenta1.retira(cretiro);
        if(retiro) System.out.println("Retiro de " + cretiro + "Efectuado con exito.");
        else System.out.println("Consigue una chamba");

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        System.out.println("Cliente 1 : " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Alfredo", new CuentaBancaria(1000));
        System.out.println("Cliente 2 : " + cliente2);
        double nvoretiro = 50;
        cliente2.getCuenta().retira(nvoretiro);
        if( cliente2.getCuenta().retira(nvoretiro))
                    System.out.println("El retiro de " + nvoretiro + "efectuado con exito, nuevo saldo"+
        cliente2.getCuenta().getSaldo());
        else System.out.println("Chambeaa");

        System.out.println("\nProbando clase Banco");
        Banco miBanco = new Banco("Banco Patito SA de CV", "Arboledas 124");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Felipe Correa", new CuentaBancaria(2000));
        miBanco.agregarCliente(cliente3);
        miBanco.getClientes().get(0).getCuenta().deposito(1500);
        miBanco.getClientes().get(1).getCuenta().deposito(1000);
        miBanco.getClientes().get(2).getCuenta().deposito(12000);
        System.out.println("\nResumen del banco \n");
        System.out.println(miBanco);
        double totalBanco = 0.0;
        for(Cliente cliente : miBanco.getClientes()){
            System.out.println(cliente);
            totalBanco += cliente.getCuenta().getSaldo();

        }
        System.out.println("\nTotal de dinero en el banco : "+ totalBanco);
    }
}
