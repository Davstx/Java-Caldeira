import java.util.LinkedHashMap;
import java.util.Map;

public class SistemaProdutos {
    private Map<String, Double> mapaProdutos;

    public SistemaProdutos() {
        mapaProdutos = new LinkedHashMap<>();
        mapaProdutos.put("Espada Mágica", 100.0);
        mapaProdutos.put("Poção de Cura", 20.0);
        mapaProdutos.put("Armadura de Aço", 150.0);
        mapaProdutos.put("Pergaminho de Invocação", 50.0);
    }

    public void imprimirProdutosNaOrdem() {
        for (Map.Entry<String, Double> entry : mapaProdutos.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Preço: " + entry.getValue());
        }
    }
}
