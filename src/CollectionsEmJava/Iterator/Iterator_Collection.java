package CollectionsEmJava.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Collection {
     public static void main(String args[]) {
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");

        Iterator<String> iterator = lista.iterator();

        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
