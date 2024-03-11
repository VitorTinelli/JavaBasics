package gerenciadortarefas;
public class Tarefa {
    private String titulo;

    public String getTitulo() {
        return titulo; //getter para o titulo
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; //setter para o titulo
    }

    public Tarefa(String titulo) {
        this.titulo = titulo; //construtor para instanciamento da classe
    }       
}
