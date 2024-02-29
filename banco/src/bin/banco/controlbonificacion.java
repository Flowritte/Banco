package bin.banco;

public class controlbonificacion {
    private double suma;

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double registrosalario(Funcionario Funcionario){
        this.suma = Funcionario.getBonificacion() + this.suma;
        System.out.println("Bonificacion actual es: " + this.suma);
        return this.suma;

    }
}
