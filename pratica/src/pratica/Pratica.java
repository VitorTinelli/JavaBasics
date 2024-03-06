package pratica;

public class Pratica {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Victoria", 17, "F");
        
        l[0] = new Livro("Cyberpunk Edgerruners", "CD PROJECT RED", 100, p[0]);
        l[1] = new Livro("Youjo Senki", "Himero Oka", 342, p[1]);
        l[2] = new Livro("Clean Codium", "Vitor Tinelli", 1482, p[1]);
        
        System.out.println(l[0].detalhes());
        
    }
    
}
