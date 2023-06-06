package lab09.classes;

public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public Gerente(String usuario, String  senha, String nome, double salario){
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }

    public double bonificacao(int porcentagem){
        return super.bonificacao(porcentagem, getSalario()) + 500;
        
    }



}
