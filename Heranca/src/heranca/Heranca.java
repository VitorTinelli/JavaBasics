package heranca;
public class Heranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Vitor");
        p4.setNome("Victoria");
        
        
        p1.setIdade(18);
        p2.setIdade(38);
        
        p3.setSexo("M");
        p4.setSexo("F");
        
        p2.setCurso("Informatica");
        p3.setSalario(3800.50f);
        p4.setSetor("TI");
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
