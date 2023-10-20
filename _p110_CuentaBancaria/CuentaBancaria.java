package _p110_CuentaBancaria;
public class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double saldo){
        Saldo = saldo;
    }

    public void deposito(double cantidad){
        Saldo = Saldo + cantidad;
    }

    public double getSaldo() {
        return Saldo;
    }
    
    public boolean retira(double cantidad){
        if(Saldo>=cantidad){
            Saldo -= cantidad;
            return true;
        }
        else
            return false;
    }
}
