package bin.banco;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int num_cuenta){
    //recibe y llama al numero de agencia y numero de cuenta
    super(agencia,num_cuenta);
    }
@Override
    public void retirar(double valor){
        // por retirar de la cuenta corriente la comision es del 20%
        double comision = 0.2;
        super.retirar(valor + comision);
    }
@Override
    public void depocita(double valor){

    }
}
