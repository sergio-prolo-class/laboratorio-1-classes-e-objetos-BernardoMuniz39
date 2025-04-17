package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;


    private void validaCpf(String cpf){
        if(cpf.equals("")){
            this.cpf = "123.456.789-00";
        }else{
            this.cpf = cpf;
        }
    }

    public Pessoa(String cpf){
        validaCpf(cpf);
    }

    public Pessoa(String cpf, String nome){
        setNome(nome);
        validaCpf(cpf);
     }
 
    public Pessoa(String cpf, String nome, int idade){
        validaCpf(cpf);
        setNome(nome);
        setIdade(idade);

    }

    public String getCpf(){
        return this.cpf;
    }

    public boolean setNome(String nome){
        if(nome.equals("")){
            System.out.println("Nome inválido!");
            return false;
        }else{
            this.nome  = nome;
            return true;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public boolean setIdade(int idade){

        if(idade < 0){
            this.idade = -1;
            return false;
        }else{
            this.idade = idade;
            return true;
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
