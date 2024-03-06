package classcaneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float  ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
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
    private void rabiscar(){
        if (this.tampada){
            System.out.println("Você precisa destampar a caneta");
        } else{
            System.out.println("Rabiscado");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
