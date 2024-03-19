package CollectionsEmJava.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Collection {
    public static void main(String args[]) {
        listaSimplesPegandoPelaChave();
        listaSimplesIterandoValores();
        listaSimplesIterandoChaves();
        listaSimples();
    }

    private static void listaSimplesPegandoPelaChave() {
        System.out.println("\nLista de numero 0\n");
        Map<Integer, String> lista = new TreeMap<>();

        adcionando(lista, 1, "Liza");
        adcionando(lista, 2, "Carlos");
        adcionando(lista, 3, "Daniel");
        adcionando(lista, 4, "Bianca");

        String nome = lista.get(3);

        System.out.println("\n");
        System.out.println("Pegando o valor da chave 3: " + nome);
    }


    private static void listaSimplesIterandoChaves() {
        System.out.println("\nLista de numero 1 \n");
        Map<Integer, String> lista = new TreeMap<>();

        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");
        
        for (Integer value : lista.keySet()) {
            System.out.println("imprimindo todos os valores de chaves: "+value + " ");
        }
    }

    private static void listaSimplesIterandoValores() {
        System.out.println("\nLista de Numero 2 \n");
        Map<Integer, String> lista = new TreeMap<>();

        adcionando(lista,1, "João da Silva");
        adcionando(lista,2, "Antonio Sousa");
        adcionando(lista,3, "Lúcia Ferreira");
        adcionando(lista,4, "João da Silva");

        imprimindo(lista);
    }

    private static void listaSimples() {
        System.out.println("\nLista de Numero 3 \n");
        Map<Integer, String> lista = new TreeMap<>();

        adcionando(lista,1, "João da Silva");
        adcionando(lista,2, "Antonio Sousa");
        adcionando(lista,4, "João da Silva");
        adcionando(lista,3, "Lúcia Ferreira");

        imprimindo(lista);
        System.out.println("");
    }

    private static void adcionando(Map<Integer, String> lista, Integer numero, String valor) {

        lista.put(numero, valor);
        System.out.println("Adcionando na lista com sucesso !!!");
    }

    private static void imprimindo(Map<Integer,String> lista){

        Set<Map.Entry<Integer,String>> entradaSet = lista.entrySet();
        List<Map.Entry<Integer,String>> entradaList = new ArrayList<>(entradaSet);

        System.out.print("\n");
        
        for(int i =0; i < entradaList.size(); i++){
            Map.Entry<Integer,String> entradaMap = entradaList.get(i);
            System.out.println("chave: " + entradaMap.getKey());
            System.out.println("Valor: " + entradaMap.getValue());
            System.out.print("\n");
        }

    }
}
