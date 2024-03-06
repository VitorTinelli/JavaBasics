package metodosespeciais;
public class Caneta {
    public String modelo;
    String cor;
    private float ponta;
    
    public Caneta(String m, String c, float p){ //metodo construtor
    this.modelo = m;
    this.cor = c;
    this.ponta = p;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println(this.modelo + this.ponta + this.cor);
    }
}