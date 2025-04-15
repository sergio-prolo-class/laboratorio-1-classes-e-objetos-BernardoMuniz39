package ifsc.poo;

public class Livro {
    private String titulo, autor;
    final String[] genero = new String[2], capitulos = new String[30];
    private int totpaginas, paglidas = 0;
    final int [] pagMudancaDeCapitulos = new int[30];

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setGeneros(String genero){
        if(this.genero[0] == null){
            this.genero[0] = genero;
        }else{
            this.genero[1] = genero;
        }
    }

    public String getGeneros(){
        if(this.genero[0] != null && this.genero[1] != null){
            return this.genero[0] + ", " + this.genero[1];
        }
        return this.genero[0];
    }

    public void setTotPaginas (int paginas){
        this.totpaginas = paginas;
    }

    public int getTotPaginas(){
        return this.totpaginas;
    }

    public void lerpaginas(int n){
        if(this.paglidas + n > totpaginas){
            System.out.println("Você leu o livro inteiro!");
            for(int i = 0 ; i < n; i++){
                if(this.paglidas == totpaginas) break;
                this.paglidas++;
            }
        } else {   
            this.paglidas += n;
        }
    }

    public int getPagLidas(){
        return this.paglidas;
    }

    public void setCapitulos(String[] nomeCapitulos){
        if(nomeCapitulos.length > 30){
            System.out.println("Número de capítulos máximos atingidos!");
        } else {
            for(int i = 0; i < nomeCapitulos.length; i++){
                this.capitulos[i] = nomeCapitulos[i];
            }
        }
    }

    public void setMudancaDeCapitulos(int [] paginaCapitulos){
        if(paginaCapitulos.length > 30){
            System.out.println("Número de capítulos máximos atingidos!");
        }
        for(int i = 0; i < paginaCapitulos.length; i++){
            this.pagMudancaDeCapitulos[i] = paginaCapitulos[i];
        }
    }

    public String getCapitulo(){
        int contador = -1;
        if(paglidas == 1){
            return this.capitulos[0];
        }
        for (int i = 0; i < this.pagMudancaDeCapitulos.length; i++) {
            int pagina = this.pagMudancaDeCapitulos[i];
            if (pagina > 0 && pagina < paglidas) {
                contador++;
            }
        }
        return this.capitulos[contador];
    }
}
