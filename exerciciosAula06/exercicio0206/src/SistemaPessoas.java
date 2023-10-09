import java.util.HashMap;
import java.util.Map;

public class SistemaPessoas {
    private Map<String, Integer> mapaPessoas;

    public SistemaPessoas() {
        mapaPessoas = new HashMap<>();
        mapaPessoas.put("Naruto", 12);
        mapaPessoas.put("Kakashi", 27);
        mapaPessoas.put("Hiruzen", 68);
    }

    public int getIdade(String nome) {
        return mapaPessoas.getOrDefault(nome, -1);
    }

    public void imprimirTerceiraIdade() {
        for (Map.Entry<String, Integer> entry : mapaPessoas.entrySet()) {
            if (entry.getValue() >= 60) {
                System.out.println(entry.getKey() + " está na terceira idade.");
            }
        }
    }
}
