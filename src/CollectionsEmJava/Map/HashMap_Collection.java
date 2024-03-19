package CollectionsEmJava.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Collection {
    public static void main(String args[]) {

        exemploListaSimplesDireta();

        listaSimplesIterandoChaveValor();

    }

    private static void listaSimplesIterandoChaveValor() {

        System.out.println("\nlista feita dentro de um metodo usando HashMap\n");

        HashMap<Integer, String> lista = new HashMap<>();

        adcionando(lista, 1, "João da Silva");
        adcionando(lista, 2, "Antonio Sousa");
        adcionando(lista, 3, "Lúcia Ferreira");
        adcionando(lista, 4, "João da Silva");

        System.out.print("\n");

        System.out.print("***** for comum *****");
        imprimindoUsandoForClassico(lista);

        System.out.print("\n");

        System.out.print("***** forEach *****");
        imprimindoUsandoForEach(lista);

        System.out.print("\n");

        System.out.println("***** Iterator *****");
        imprimindoUsandoInterador(lista);

        System.out.print("\n");

    }

    private static void adcionando(Map<Integer, String> lista, Integer valor, String nome) {

        lista.put(valor, nome);
        System.out.println("Foi Adcionando na Lista HashMap !!!");

    }

    private static void imprimindoUsandoInterador(Map<Integer, String> lista) {
        System.out.println("\nVerificacao de Lista Completa Usando o Interador: \n");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
            System.out.print("\n");
        }
    }

    private static void imprimindoUsandoForEach(Map<Integer, String> lista) {
        System.out.println("\nVerificacao de Lista Completa Usando o ForEach: \n");

        for (Map.Entry<Integer, String> entrada : lista.entrySet()) {
            Integer chave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + valor);
            System.out.print("\n");
        }
    }

    private static void imprimindoUsandoForClassico(Map<Integer, String> lista) {

        System.out.println("\nVerificacao de Lista Completa: \n");

        Set<Map.Entry<Integer, String>> entradaSet = lista.entrySet();

        List<Map.Entry<Integer, String>> entradaList = new ArrayList<>(entradaSet);

        for (int i = 0; i < entradaList.size(); i++) {
            Map.Entry<Integer, String> e = entradaList.get(i); 
            System.out.println("Chave: " + e.getKey()); 
            System.out.println("Valor: " + e.getValue()); 
            System.out.print("\n");
        }
    }

    private static void exemploListaSimplesDireta() {

        System.out.println("\n(Exemplo Lista Simples usando HashMap do Java)");
        HashMap<Integer, String> lista = new HashMap<>();

        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        imprimindoUsandoForClassico(lista);
    }
}
