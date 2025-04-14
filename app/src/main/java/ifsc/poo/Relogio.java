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
        if (this.hora == 24) {
            this.hora = 0;
        }
    }

    public void avancaMinuto(){
        this.minuto++;
        if(this.minuto == 60){
            this.minuto = 0;
            avancaHora();
        }
        
    }

    public void avancaSegundo(){
        this.segundo++;
        if(this.segundo == 60){
            this.segundo = 0;
            avancaMinuto();
        }
        
    }

    //O typecasting aqui é feito para apresentar o horário no formato 00 (int) e não 0.0 no formato de float
    public String getHora(){
        return String.format("%02d:%02d:%02d", (int) this.hora, (int) this.minuto, (int) this.segundo);
    }

    public String horaFormatada(){
       
        if(this.hora > 12){

            this.hora = switch(this.hora){
                case 13 -> 1;
                case 14 -> 2;
                case 15 -> 3;
                case 16 -> 4;
                case 17 -> 5;
                case 18 -> 6;
                case 19 -> 7;
                case 20 -> 8;
                case 21 -> 9;
                case 22 -> 10;
                case 23 -> 11;
                default -> 0;
            };

            return String.format("%02d pm %02d m %02d s", (int) this.hora, (int) this.minuto, (int) this.segundo);
        }

        return String.format("%02d am %02d m %02d s", (int) this.hora, (int) this.minuto, (int) this.segundo);
    }

}