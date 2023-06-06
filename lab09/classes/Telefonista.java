package lab09.classes;

public class Telefonista extends Funcionario{
    private int estacaoDeTrabalho;

    public Telefonista(int estacaoDeTrabalho, String nome, double salario){
        super(nome, salario);
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }
    
}
