package lab09;

public class Secretaria extends Funcionario{
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public Secretaria(int ramal, String nome, double salario){
        super(nome, salario);
        this.ramal = ramal;
    }

    
}
