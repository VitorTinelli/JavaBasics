package pratica;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totalPaginas=" + totalPaginas + ", paginaAtual=" + paginaAtual + ", aberto=" + aberto + ", leitor=" + leitor.getPessoa() + '}';
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.isAberto()){
            System.out.println("Livro ja está aberto");
        } else{
            System.out.println("Abrindo livro!");
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()){
            System.out.println("Fechando Livro");
            this.setAberto(false);
        } else{
            System.out.println("Livro ja está fechado");
        }
    }

    @Override
    public void folhear(int p) {
        this.setPaginaAtual(p);
    }

    @Override
    public void avancarPag() {
        if (this.getPaginaAtual() == this.getTotalPaginas()){
            System.out.println("Você está na ultima pagina!");
        } else {
            this.setPaginaAtual(getPaginaAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPaginaAtual() == 0){
            System.out.println("Você está na primeira página");
        } else{
            this.setPaginaAtual(getPaginaAtual() + 1);
        }
    }
}
