package CollectionsEmJava.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Collection {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Set<String> lista = new LinkedHashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }
}
