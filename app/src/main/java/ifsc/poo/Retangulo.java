package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;
    private static float maiorArea = 0, maiorPerimetro  = 0;
    private static Retangulo RetanguloArea, RetanguloPerimetro; 

    public Retangulo(float largura, float altura){
        setAltura(altura);
        setLargura(largura);

        if(this.getArea() > maiorArea){
            maiorArea = this.getArea();
            RetanguloArea = this;
        }

        if(this.getPerimetro() > maiorPerimetro){
            maiorPerimetro = this.getPerimetro();
            RetanguloPerimetro = this;
        }
    }

    public static Retangulo getRetanguloMaiorArea(){
        return RetanguloArea;
    }

    public static Retangulo getRetanguloMaiorPerimetro(){
        return RetanguloPerimetro;
    }

    public boolean  setLargura(float largura){
        if(largura < 0 ){
            this.largura = 1;
            return false;
        }
            this.largura = largura;
            return true;
        
    }

    public boolean  setAltura(float altura){
        if(altura < 0){
            this.altura = 1;
            return false;
        }
            this.altura = altura;
            return true;
        
    }

    public float getArea(){
        
        return this.largura * this.altura;
    }

    public float getPerimetro(){
        return this.largura * 2 + this.altura * 2;
    }
}
