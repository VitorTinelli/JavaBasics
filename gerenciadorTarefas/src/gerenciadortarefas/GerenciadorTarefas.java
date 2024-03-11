package gerenciadortarefas;

import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {
        
        //estanciando objeto para classe ListaTarefas e declarando o teclado
        ListaTarefas lista = new ListaTarefas();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            
            //menu no console
            System.out.println(" MENU - LISTA DE TAREFAS ");
            System.out.println("Digite 1 para adicionar tarefa; ");
            System.out.println("Digite 2 para remover tarefa; ");
            System.out.println("Digite 3 para visualizar tarefas;");
            System.out.println("Digite 4 para sair; ");
            System.out.println("-");
            System.out.println("Digite a opção: ");
            
            //recebendo a entrada e usando o next line para nao enviar algo em branco nas opcoes abaixo(quebra de linha)
            int op = teclado.nextInt();
            teclado.nextLine();
            
            //if Operador == 1 {Adicionar Objeto Tarefa}
            switch (op) {
                case 1:
                    //recebendo o titulo, criando o objeto Tarefa, e adicionando-o a lista de tarefas
                    System.out.println("Digite o título da tarefa (Adição): ");
                    String titulo = teclado.nextLine();
                    Tarefa addTarefa = new Tarefa(titulo);
                    lista.AdicionarTarefas(addTarefa);
                    System.out.println("Tafera adicionada com sucesso!");
                    break;
                    
                case 2:
                    //recebendo o titulo, e removendo o objeto com o mesmo titulo.
                    System.out.println("Digite o título da tarefa (Remoção): ");
                    String tituloRemove = teclado.nextLine();
                    lista.RemoverTarefas(tituloRemove);
                    System.out.println("Tafera removida com sucesso!");
                    break;
                    
                case 3:
                    // recebendo todos os objetos da lista de Tarefas, atribuindo-os a tarefas e depois percorendo toda a lista recebida e imprimindo cada Tarefa na tela.
                    System.out.println("Sua lista de tarefas: ");
                    System.out.println("");
                    List<Tarefa> tarefas = lista.getTarefas();
                    for (Tarefa t : tarefas) {
                        System.out.println(t);
                    }
                    System.out.println("");
                    break;
                    
                case 4:
                    //fim do sistema
                    System.out.println("Apagando e saindo da sua lista de tarefas!");
                    System.exit(0);
                    
                default:
                    //caso receba algo difernte de 1, 2, 3 ou 4:
                    System.out.println("Opção inválida, tente novamente.");
            }

        }

    }

}
