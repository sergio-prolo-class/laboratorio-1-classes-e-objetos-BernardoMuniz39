/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        System.out.println("Classe Lâmpada");
        System.out.println("");
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.ligar();
        if(lampada1.verEstado()){
            System.out.println("Lâmpada 1 está ligada");
        }else{
            System.out.println("Lâmpada 1 está desligada"); 
        }

        lampada2.desligar();

        if(lampada2.verEstado()){
            System.out.println("Lâmpada 2 está ligada");
        }else{
            System.out.println("Lâmpada 2 está desligada"); 
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        System.out.println("Classe Pessoa");
        System.out.println("");


        Pessoa alice = new Pessoa();
        Pessoa bruno = new Pessoa();


        alice.setIdade(22);
        bruno.setIdade(25);
        alice.setNome("Alice");
        bruno.setNome("Bruno");

        for(int i = 0; i < 3; i++){
            bruno.felizAniversario();
        }

        System.out.println("\nIdade de Bruno: " + bruno.getIdade());
        System.out.println("Idade de ALice: " + alice.getIdade());
        System.out.println("");

        alice.setIdade(-44);
        bruno.setNome("");

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Classe Retângulo");
        System.out.println("");

        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(4);

        System.out.println("Área: " + retangulo.getArea() + " m²");
        System.out.println("Perímetro: " + retangulo.getPerimetro() + " m");
        System.out.println("");

        Retangulo[] retangulos = new Retangulo[10];

        Random r = new Random();
        float razao = 0, maiorRazao;
        int indice = 0;

        for(int i =0; i<10; i++){
            float altura = r.nextFloat(10);
            float largura = r.nextFloat(10);

            retangulo.setAltura(altura);
            retangulo.setLargura(largura);
            retangulos[i] = retangulo;

            maiorRazao = retangulo.getArea() / retangulo.getPerimetro();
            System.out.println("Razão do retângulo " + (i + 1) + ": " + maiorRazao);

            if(maiorRazao > razao){
                indice = i;
                razao = maiorRazao;
            }
        }

        System.out.println(String.format("\nMaior razão foi do retângulo %d: %.2f\n", indice + 1, razao));

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Classe Relógio");
        System.out.println("");

        Relogio relogio = new Relogio();
        relogio.ajustaHora((byte)14, (byte)58, (byte)32);

        System.out.println("Hora atual: " + relogio.getHora());
        for(int i = 0; i < 2; i++){
            String s = (i + 1 > 1) ? " minutos" : " minuto";
            System.out.println("Avançando " + (i + 1) + s + "...");
        }
        
        relogio.avancaMinuto();
        relogio.avancaMinuto();

        System.out.println("Hora atual após avançar dois minutos: " + relogio.getHora());

        System.out.println("");
        relogio.ajustaHora((byte)23, (byte)59, (byte)59);
        System.out.println("Hora atual: " + relogio.getHora());
        System.out.println("Avançando 1 segundo...");
        relogio.avancaSegundo();
        System.out.println("Hora atual após avançar um segundo: " + relogio.getHora());

        //Os ajustes feitos estão detalhados dentro da função horaFormatada
        System.out.println("");
        relogio.ajustaHora((byte)23, (byte)30, (byte)45);
        System.out.println("Hora formatada: " + relogio.horaFormatada());
        System.out.println("");

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Classe Produto");
        System.out.println("");

        Produto geladeira = new Produto();
        Produto microondas = new Produto();

        geladeira.setNome("Geladeira");

        geladeira.setPreco(832);
        microondas.setPreco(499);
        System.out.println("Preço da geladeira: R$ " + geladeira.getPreco());
        System.out.println("Preço do microondas: R$ " + microondas.getPreco());

        geladeira.setDesconto(6);
        microondas.setDesconto(12);
        System.out.println("Preço da geladeira com desconto: R$ " + geladeira.getPreco());
        System.out.println("Preço do microondas com desconto: R$ " + microondas.getPreco());
        
        System.out.println(geladeira.anuncio());


        //A alteração que eu faria seria mudar o tipo de atributo preço para um float, para evitar fazer conversões desnecessárias

        
    }
}
