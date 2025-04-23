package ifsc.poo;

public class Produto {
    private String nome, codigo;
    private int desconto, preco;
    private static int qtdTot = 0;
    static String []register = new String[50];


    public Produto(String nome, int preco, int descontoInicial){

        if(setNome(nome) &&  setPreco(preco) && validaDesconto(descontoInicial)){
            qtdTot++;
            this.codigo = String.format("CD:%03d-%03d", qtdTot / 1000, qtdTot % 1000);
            updateRegister(this.codigo, this.nome, this.getPreco(),this.desconto);   
         }
       
    }

    static String [] getRegister(){
        return register;
    }



    static void updateRegister(String codigo, String nome, float preco, int desconto){
        register[0] = "Código;Nome;Preço;Desconto";

        boolean existe = false;
        int k = 0;
        if(qtdTot == 50){
           
            register[k+1] = codigo +  ";" + nome + ";" + preco + ";" + desconto;
            if(k == 49){
                k = 0;
            }else{
                k++;
            }
        
        }

        for(int i = 0; i <= qtdTot; i++){
            if(register[i] == null)continue;
            String []s = register[i].split(";");
            if(register[i] != null && s[0].equals(codigo)){
                register[i] = codigo +  ";" + nome + ";" + preco + ";" + desconto;
                existe  = true;
                break;
            }
        }

        if(!existe){
            register[qtdTot] = codigo + ";" + nome + ";" + preco + ";" + desconto;
        }
   

    }

    public String getCodigo(){
        return this.codigo;
    }

    private boolean validaDesconto(int descontoInicial){
        if(descontoInicial == 0){
            this.desconto = descontoInicial;
            return true;
        }
        System.out.println("Desconto de R$ " + descontoInicial + " no produto " + this.nome + " é inválido!");
        return false;
    }

    public int getTotProdutos(){
        return qtdTot;
    }

    private boolean setNome(String nome){
        if(nome.equals("")){
            System.out.println("Nome inválido!");
            return false;
        }
            this.nome = nome;
            return true;
        
       
    }

    public String getNome(){
        return this.nome;
    }

    private boolean setPreco(int  preco){
        if(preco < 0){
            System.out.println("Preço inválido!");
            return false;
        }
            this.preco = preco;
            return true;
        
    }

    public float getPreco(){
        return (float) this.preco * (1 - this.desconto/100.0f);
    }

    public boolean setDesconto(int desconto){

        if(desconto >= 0 && desconto <= 100){
            this.desconto = desconto;
            updateRegister(this.codigo, this.nome, this.getPreco(),this.desconto);  
            return true;

        }
        return false;
        
    }

    public int getDesconto(){
        return this.desconto;
    }

    public String anuncio(){
        return this.nome + ":" + " de R$ " + this.preco + " por APENAS R$ " + this.getPreco();
    }
}