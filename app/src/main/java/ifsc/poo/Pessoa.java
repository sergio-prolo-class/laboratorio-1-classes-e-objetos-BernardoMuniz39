package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        if(nome.equals("")){
            System.out.println("Nome inválido");
        }else{
            this.nome = nome;
        }
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){

        if(idade < 0){
            System.out.println("Idade inválida!");
            
        }else{
            this.idade = idade;
        }
    }

    public int getIdade(){
        return this.idade;
    }

    public void felizAniversario(){
        this.idade++;
        System.out.println("Feliz aniversário " + this.nome);
    }
}
