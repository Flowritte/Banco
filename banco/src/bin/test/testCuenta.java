package bin.test;
import bin.banco.*;
public class testCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(12358,558798);
        CuentaAhorros ca = new CuentaAhorros(12358,558798);
        cc.depocita(3500);
        cc.transferir(1500,ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}

