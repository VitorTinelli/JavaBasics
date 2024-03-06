package banco;

public class Banco {
    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        contaBanco p2 = new contaBanco();
        p2.setConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(1000);
        
        
        p1.sacar(150);
        p1.fecharConta();
        
        System.out.println("");
        p1.estadoAtual();
        System.out.println("");
        p2.estadoAtual();
    }
    
}
