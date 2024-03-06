package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        
        m.setPeso(35.6f);
        a.setPeso(10.3f);
        
        m.setIdade(12);
        a.setIdade(3);
        
        m.setCorPelo("Marrom");
        a.setCorPena("Verde");
        
        m.setMembros(4);
        a.setMembros(2);
       
        m.alimentar();
        a.alimentar();
        
        m.emitirSom();
        a.emitirSom();
        
        m.locomover();
        a.locomover();
        
        a.fazerNinho();
        
    }
    
}
