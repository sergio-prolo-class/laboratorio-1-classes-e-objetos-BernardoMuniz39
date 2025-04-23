package ifsc.poo;

public class Navio {
    private int tamanho;
    private String nomenclatura;
    private String posicoesEncontradas = "", posicoesAtingidas = "";

    public boolean setTamanho(int tamanho){
        if(tamanho < 0){
            System.out.println("Tamanho inválido!");
            return false;
        }
        this.tamanho = tamanho;
        return true;
    }
    
    public boolean setNomenclatura(String letra){
        this.nomenclatura = letra;
        return true;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public String getNomenclatura(){
        return this.nomenclatura;
    }

    public String getPosicoes(String [][] tabuleiro){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){

           
                if(tabuleiro[i][j].equals(this.nomenclatura)){
                    posicoesEncontradas += "(" + i + "," + j + ")";
                }
            }
        }

        return posicoesEncontradas;

    }

    public String getOrientacao(String[][] tabuleiro) {
        String orientacao = "Indefinida";
    
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
    
                if (j + 1 < tabuleiro[i].length && tabuleiro[i][j].equals(this.nomenclatura) && tabuleiro[i][j + 1].equals(this.nomenclatura)) {
                    return "Horizontal";
                }

                if (i + 1 < tabuleiro.length &&tabuleiro[i][j].equals(this.nomenclatura) && tabuleiro[i + 1][j].equals(this.nomenclatura)) {
                    return "Vertical";
                }
            }
        }
    
        return orientacao;
    }

    public boolean bombardear(int linha, int coluna, String [] [] tabuleiro){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){

           
                if(tabuleiro[i][j].equals(this.nomenclatura) && i == linha && j == coluna){
                   posicoesAtingidas += "(" + linha + "," + coluna + ")";
                   this.tamanho--;
                   return true;
                }
            }
        }
        return false;
    }


    public String verificaPosicoesBombardeadas(){
        return this.posicoesAtingidas;
    }
    public boolean navioAfundado(){
        return tamanho == 0;
    }
    
    }


    

