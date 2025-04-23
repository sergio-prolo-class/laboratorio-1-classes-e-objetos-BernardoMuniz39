package ifsc.poo;

public class Relogio {
    byte hora, minuto, segundo;

    public Relogio(byte hora) {
        if (hora < 0) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Relogio(byte hora, byte minuto) {
        if (hora < 0 || minuto < 0) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public Relogio(byte hora, byte minuto, byte segundo) {
        if (hora < 0 || minuto < 0 || segundo < 0) {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    static void sincronizaRelogio(Relogio relogio1, Relogio relogio2) {
        relogio1.hora = relogio2.hora;
        relogio1.minuto = relogio2.minuto;
        relogio1.segundo = relogio2.segundo;
    }

    static String difClocks(Relogio relogio1, Relogio relogio2) {
        return String.format("Hora(s): %02d, minuto(s): %02d, segundo(s): %02d", (int) relogio1.hora - relogio2.hora,
                (int) relogio1.minuto - relogio2.minuto, (int) relogio1.segundo - relogio2.segundo);
    }

    public void ajustaHora(byte hora, byte minuto, byte segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void avancaHora() {
        this.hora++;
        if (this.hora == 24) {
            this.hora = 0;
        }
    }

    public void avancaMinuto() {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            avancaHora();
        }

    }

    public void avancaSegundo() {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            avancaMinuto();
        }

    }

    // O typecasting aqui é feito para apresentar o horário no formato 00 (int) e
    // não 0.0 no formato de float
    public String getHora() {
        return String.format("%02d:%02d:%02d", (int) this.hora, (int) this.minuto, (int) this.segundo);
    }

    public String horaFormatada() {

        if (this.hora > 12) {

            this.hora = switch (this.hora) {
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