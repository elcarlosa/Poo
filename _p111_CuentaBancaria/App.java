package _p111_CuentaBancaria;

public class App {
    public static void main(String[] args) {
        //Crea banco
        Banco miBanco = new Banco("Banco bla bla", "jijijija");
        System.out.print("\033[H\033[2J");System.out.flush();

        miBanco.agregarCliente(new Cliente("Calos Alfredo"));
        miBanco.agregarCliente(new Cliente("Pepe"));
        miBanco.agregarCliente(new Cliente("olape"));
        miBanco.agregarCliente(new Cliente("Maria Maria"));
        System.out.println("\n>>> Los clientes del banco son:\n");
        miBanco.reporte();

        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 500));
        miBanco.getClientes().get(1).agregarCuenta(new CuentaDeAhorro(2500, 500));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 600));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));
        System.out.println("\n>>> Los clientes con sus cuentas y saldos iniciales son:\n");
        miBanco.reporte();

        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(0).retira(100);
        miBanco.getClientes().get(1).getCuentas().get(0).retira(100);
        miBanco.getClientes().get(2).getCuentas().get(0).retira(300);
        miBanco.getClientes().get(2).getCuentas().get(0).retira(1000);
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de los movimientos son: \n");
        miBanco.reporte();
        miBanco.calcularintres();
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de los intereses: \n");
        miBanco.reporte();
    }
}
