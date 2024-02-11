package CollectionsEmJava.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Collection {
    public static void main(String args[]) {
        System.out.println();
        exemploListaSimples();
    }

    /**
     * Não repete valores na lista
     * Tem ordem natural dos objetos
     */
    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }
}
