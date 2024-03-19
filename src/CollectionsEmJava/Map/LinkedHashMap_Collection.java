package CollectionsEmJava.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap_Collection {
    public static void main(String args[]) {
        listaSimplesLinkedHashMap();
    }

    private static void listaSimplesLinkedHashMap() {
        System.out.println("\nexemplo Lista Simples LinkedHashMap\n");
        Map<Integer, String> lista = new LinkedHashMap<>();
        
        adcionando(lista, 1, "João da Silva");
        adcionando(lista, 2, "Antonio Sousa");
        adcionando(lista, 3, "João da Silva");
        adcionando(lista, 4, "Lúcia Ferreira");

        imprimindo(lista);
        System.out.println("");
    }

    private static void imprimindo(Map<Integer, String> lista) {
        Set<Map.Entry<Integer, String>> entrandaSet = lista.entrySet();
        List<Map.Entry<Integer, String>> entradaList = new ArrayList<>(entrandaSet);

        System.out.print("\n");
        for(int i=0; i < entradaList.size(); i++){
            Map.Entry<Integer,String> entradaMap = entradaList.get(i);
            System.out.println("Chave: " + entradaMap.getKey());
            System.out.println("Valor: " + entradaMap.getValue());
            System.out.print("\n");
        }
    }

    private static void adcionando(Map<Integer,String> lista, Integer numero, String valor) {
        lista.put(numero, valor);
        System.out.println("valores adcionados com sucesso !!!");
    }

}
