package herancapoli;
public class HerancaPoli {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        // Visitante v1 = new Visitante();
        // v1.setNome("Vitor");
        // v1.setIdade(18);
        // v1.setSexo("M");
        // System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setCurso("Info");
        a1.setIdade(19);
        a1.setMatricula(47452);
        a1.setNome("Vitão");
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setCurso("Meca");
        b1.setIdade(17);
        b1.setMatricula(98323);
        b1.setNome("Tinelli");
        b1.setSexo("M");
        b1.setBolsa(50);
        b1.pagarMensalidade();
        b1.renovarBolsa();
                
        
    }
    
}
