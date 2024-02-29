package bin.banco;

public class Gerente extends Funcionario {
    private  String clave;
    //clave de acceso del funcionario

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getBonificacion(){
        return super.getBonificacion() + super.getSalario();
        //llama al metodo del padre para la bonificacion + el salario
    }

    public boolean iniciarsesion(String clave){
        if(this.clave == clave){
            //compara la clave incertada con la que entra el funcionario
            return true;
        }else {
            return false;
        }
    }
}
