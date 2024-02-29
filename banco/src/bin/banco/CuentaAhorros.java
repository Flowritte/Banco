package bin.banco;

public class CuentaAhorros extends Cuenta{
    public CuentaAhorros(int agencia, int num_cuenta){
        //recibe de parametros el numero de a gencia y el numero de cuenta
        super(agencia, num_cuenta);
    }
    public void depocita(double valor){
        //metodo para depocitar a la cuenta ahorros
        this.saldo = this.saldo + valor;
        }

}
