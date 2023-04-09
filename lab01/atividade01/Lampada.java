
public class Lampada {
    boolean estadoDalampada;
    
    public void acende(){
        estadoDalampada = true;
    }

    public void apaga(){
        estadoDalampada = false;
    }

    public void mostraEstado(){
        if(estadoDalampada){
            System.out.println("Lâmpada acesa!");
        }
        else {
            System.out.println("Lâmpada apagada!");
        }
        }
    }

