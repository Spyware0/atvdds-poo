package lab06;

public class Conta {
    private Cartao cartao;
    private int senha;
    private double saldo;
    private int numero;

    public Conta(int numConta, int numCartao, Cliente titular, int senha, double saldo) {
        this.numero = numConta;
        this.cartao = new Cartao(numCartao, titular);
        this.senha = senha;
        this.saldo = saldo;
    }

    public Cartao getCartao(){
        return this.cartao;
    }

    public void alteraCartao(int numeroDoCartao, Cliente titular) {
        this.cartao = new Cartao(numeroDoCartao, titular);
    }



}
