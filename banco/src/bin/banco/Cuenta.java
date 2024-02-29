package bin.banco;

public class Cuenta {
    protected  double saldo;
    private int agencia = 1;
    private int num_cuenta;




    private cliente titular = new cliente();
    private static  int total;
    //contador de cuentas creadas dentro de la clse cuenta

    public Cuenta(){
        // se crea una nueva cuenta vacia
    }
    //meotodo para crear una cuenta
    public Cuenta (int agencia, int num_cuenta){
        this.agencia = agencia;
        this.num_cuenta = num_cuenta;
        System.out.println("se crea una cuenta: "+ this.num_cuenta);
        Cuenta.total++;
        //suma 1 al total creado de cuentas
    }

    // metodo para depocitar en la cuenta
    public void depocita(double valor){
        this.saldo = this.saldo + valor;
        //el saldo de la cuenta + el valor

    }

    //metodo para sacar saldo
    public void retirar(double valor){
        //se compara si tiene saldo para poder retirar el monto
        if(this.saldo>= valor){
            this.saldo -= valor;

        }else {
            System.out.println("no cuenta con sufiente saldo");
        }
    }

    public  boolean transferir( double valor, Cuenta destino){
        //compara el saldo
        if(this.saldo >= valor){
            //si hay llama al metodo para ratirar y llama al metodo para depocitar
            this.retirar(valor);
            destino.depocita(valor);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {this.agencia = agencia;}

    public int getNum_cuenta() {return num_cuenta;}

    public void setNum_cuenta(int num_cuenta) {this.num_cuenta = num_cuenta;}

    public cliente getTitular() {return titular;}

    public void setTitular(cliente titular) {this.titular = titular;}

    public static int getTotal() {return total;}


}
