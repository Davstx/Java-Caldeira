import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            listaDeTarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Índice inválido. Nenhuma tarefa removida.");
        }
    }

    public void exibirTarefas() {
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println("Tarefa #" + (i + 1) + ":\n" + listaDeTarefas.get(i) + "\n");
        }
    }
}
