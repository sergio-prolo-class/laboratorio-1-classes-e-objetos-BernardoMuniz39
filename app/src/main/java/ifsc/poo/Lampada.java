package ifsc.poo;

public class Lampada {
    private boolean estado;
    private static int qtd;

    public Lampada(boolean estado){
        this.estado = estado;
        qtd++;
    }

    public Lampada(){
        qtd++;
        this.estado = false;
    }

    public int getTotal(){
        return qtd;
    }

    public void ligar(){
        this.estado = true;
    }

    public void desligar(){
        this.estado = false;
    }

    public boolean verEstado(){
        return this.estado;
    }

    
}
