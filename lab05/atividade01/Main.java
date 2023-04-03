package lab05.atividade01;

public class Main {
    public static void main(String[] args){

        Automovel carro = new Automovel("PTY5B23", 10, 50);

        carro.abastece(50);
        System.out.println("Combustível no tanque: " + carro.getCombustivelNoTanque());

        carro.dirige(400);

        System.out.println("Combustível no tanque: " + carro.getCombustivelNoTanque());
        System.out.println("Viagens realizadas: " + carro.getNumeroDeViagensRealizadas());

        System.out.println("Quilômetros percorridos: " + carro.getKmTotal());

        carro.dirige(150);

        System.out.println("Quilômetros percorridos: " + carro.getKmTotal());

    }
}
