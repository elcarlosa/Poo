package _p111_CuentaBancaria;

public class CuentaDeAhorro extends CuentaBancaria{
    private double TasaInteres;

    public CuentaDeAhorro(double cantidad, double tasainteres){
        super(cantidad);
        TasaInteres = tasainteres;
    }
    public void calcularintres(){
        Saldo += Saldo * TasaInteres;
    }
    @Override
    public boolean retira(double cantidad){
        if( Saldo >= cantidad){
            Saldo -= cantidad;
        return true;
        }
        else
                return false;
    }

    @Override
    public String toString(){
        return "CuentaDeAhorro [ "+super.toString() + ", TasaInteres = "+ TasaInteres + " ]";
    }
}
