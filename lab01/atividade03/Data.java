package lab01.atividade03;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean dataEhValida(){
        if ((dia > 0 && mes > 0 && ano > 0) && (dia < 32) && (mes < 13) && (dia < 30 && mes == 2)){
            return true;
        }
        return false;
    }

    public void mostraData() {
        if(dataEhValida()){
            System.out.println(this.dia + "/" + this.mes + "/" + this.ano); 
        }
        else{
            System.out.println("Data não é válida");
        }
    }
}
