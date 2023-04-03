package lab05.atividade02;

public class PopulacaoDeBaratas {
    private long populacao;

    public PopulacaoDeBaratas(long populacao) {
        this.populacao = populacao;
    }

    public PopulacaoDeBaratas() {
        this.populacao = 5;
    }

    public void esperaUmTempo() {
        this.populacao *= 2;
    }

    public void pulveriza() {
        this.populacao -= this.populacao * 0.25;
    }

    public String toString(){
        return "População: " + this.populacao;
    }
}
