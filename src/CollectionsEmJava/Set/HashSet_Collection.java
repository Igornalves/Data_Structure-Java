package CollectionsEmJava.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Collection {
    public static void main(String args[]) {
        System.out.println("\n");
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
        System.out.println("\n");
    }

    private static void exemploNovo() {
        System.out.println("****** exemploNovo ******");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        System.out.println(inteiros);
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        Set<String> lista = new HashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
