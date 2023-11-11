package org.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListaStrings {
    public List<String> nomes = Arrays.asList("Luffy", "Zoro", "Nami", "Usopp", "Sanji");
    public long totalNomes = nomes.stream().count();

    public String maiorNome = nomes.stream().max(Comparator.comparing(String::length)).get();

    public void contarStringsMaisFrequentes() {
        Map<String, Long> contagemPorString = nomes.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        contagemPorString.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        ListaStrings listaStrings = new ListaStrings();
        listaStrings.contarStringsMaisFrequentes();
    }
}
