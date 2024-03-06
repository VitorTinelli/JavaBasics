package classcaneta;

public class Caneta {
    String modelo;
    String cor;
    float  ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        if (this.tampada){
            System.out.println("Caneta tampada");
        } else{
            System.out.println("Caneta Destampada");
        }
    }
    void rabiscar(){
        if (tampada){
            System.out.println("Você precisa destampar a caneta");
        } else{
            System.out.println("Rabiscado");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
}
