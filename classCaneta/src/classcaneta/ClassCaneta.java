
package classcaneta;
public class ClassCaneta {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        // c1.tampada = false;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        
       
       
    }
    
}
