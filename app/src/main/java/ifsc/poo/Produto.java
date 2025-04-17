package ifsc.poo;

public class Produto {
    private String nome;
    private int preco;
    private int desconto;

    public void setNome(String nome){
        if(nome.equals("")){
            System.out.println("Nome inválido!");
        }else{
            this.nome = nome;
        }
       
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(int preco){
        if(preco < 0){
            System.out.println("Preço inválido!");
        }else{
            this.preco = preco;
        }
    }

    public float getPreco(){
        return (float) this.preco * (1 - this.desconto/100.0f);
    }

    public void setDesconto(int desconto){
        this.desconto = desconto;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return this.nome + ":" + " de R$ " + this.preco + " por APENAS R$ " + this.getPreco();
    }
}