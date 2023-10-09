import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonica {
    private Map<String, Contato> agenda;

    public AgendaTelefonica() {
        agenda = new TreeMap<>();
        // Adicionar alguns contatos
        agenda.put("Monkey D. Luffy", new Contato("Monkey D. Luffy", "123456789", "Sunny Village", "Leste"));
        agenda.put("Roronoa Zoro", new Contato("Roronoa Zoro", "987654321", "Sword Village", "Leste"));
        agenda.put("Nami", new Contato("Nami", "111222333", "Orange Town", "Leste"));
        agenda.put("Usopp", new Contato("Usopp", "444555666", "Syrup Village", "Leste"));
        agenda.put("Sanji", new Contato("Sanji", "777888999", "Baratie", "Leste"));
    }

    public void imprimirContatosOrdemAlfabetica() {
        for (Contato contato : agenda.values()) {
            System.out.println(contato);
        }
    }

    public void imprimirContatosPorLocalidade(String localidade) {
        for (Contato contato : agenda.values()) {
            if (contato.getLocalidade().equalsIgnoreCase(localidade)) {
                System.out.println(contato);
            }
        }
    }
}
