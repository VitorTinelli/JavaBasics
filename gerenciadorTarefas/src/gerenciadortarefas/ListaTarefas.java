package gerenciadortarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private final List<Tarefa> tarefas; //criando a lista de tarefas (contera objetos da classe Tarefa)

    public ListaTarefas() {
        tarefas = new ArrayList<>(); 
    }

    public void AdicionarTarefas(Tarefa adicionar) {
        tarefas.add(adicionar); //adiciona a lista tarefas o titulo (adicionar)
    }

    public void RemoverTarefas(String titulo) {
        tarefas.removeIf(obj -> obj.getTitulo().equals(titulo)); //percorre a lista inteira de tarefas, e se o titulo de obj (objeto atual da lista) for igual o recebido, remove a Tarefa
    }

    public List<Tarefa> getTarefas() {
        return tarefas; //metodo getter
    }
}
