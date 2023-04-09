package lab06;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome e seu cpf: ");
        Cliente gabriel = new Cliente(s.next(), s.next());

        Conta itau = new Conta(1, 1, gabriel, s.nextInt(), 0);



    }
}