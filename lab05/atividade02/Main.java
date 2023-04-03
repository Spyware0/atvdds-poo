package lab05.atividade02;

public class Main {
    public static void main(String[] args){
        PopulacaoDeBaratas pop1 = new PopulacaoDeBaratas(10);
        PopulacaoDeBaratas pop2 = new PopulacaoDeBaratas();

        pop1.esperaUmTempo();
        pop1.pulveriza();
        pop1.pulveriza();

        System.out.println("População 1: " + pop1.toString());

        System.out.println("População 2: " + pop2.toString());
        pop2.esperaUmTempo();
        pop2.pulveriza();
        pop2.pulveriza();
        System.out.println("População 2: " + pop2.toString());

    } 
}
