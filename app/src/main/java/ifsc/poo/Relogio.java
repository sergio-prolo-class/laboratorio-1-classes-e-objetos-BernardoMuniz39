package ifsc.poo;

public class Relogio{
    byte hora, minuto, segundo;

    public void ajustaHora(byte hora, byte minuto, byte segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void avancaHora(){
        this.hora++;
    }

    public void avancaMinuto(){
        if(this.minuto == 59){
            this.minuto = 0;
            avancaHora();
        }
        this.minuto++;
    }

    public void avancaSegundo(){
        if(this.segundo == 59){
            this.segundo = 0;
            avancaMinuto();
        }
        this.segundo++;
    }

}