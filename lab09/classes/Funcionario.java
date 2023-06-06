package lab09.classes;

public class Funcionario {
    private String nome;
     double salario;
    private static double valeRefeicaoDiario = 15;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = (salario + bonificacao(10, salario));
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getValeRefeicaoDiario(){
        return valeRefeicaoDiario;
    }

    public void reajustaValeRefeicaoDiario(double valor){
        valeRefeicaoDiario = valor;
    }

    public double bonificacao(int porcentagem, double sal){
        return (sal * (porcentagem / 100));
    }

    public void mostraDados(){
        System.out.println("Nome: " + getNome() + "\nSalário: " + getSalario() + "\nBonificação: " + bonificacao(10, getSalario()));
    }
}
