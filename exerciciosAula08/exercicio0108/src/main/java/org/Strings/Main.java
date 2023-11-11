package org.Strings;

public class Main {
    public static void main(String[] args) {
        ListaStrings listaStrings = new ListaStrings();

        // Imprimir o número total de strings
        System.out.println("Número total de strings: " + listaStrings.totalNomes);

        System.out.println("Maior nome: " + listaStrings.maiorNome);

        listaStrings.contarStringsMaisFrequentes();
    }
}
