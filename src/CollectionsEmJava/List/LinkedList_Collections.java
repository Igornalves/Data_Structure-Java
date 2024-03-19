package CollectionsEmJava.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedList_Collections {
    public static void main(String[] args) {

        List<Integer> listaDeNumeros = new LinkedList<>();
        List<String> listaDeNomes = new LinkedList<>();

        embaralhandoNumeros(listaDeNumeros, 25);
        
        imprimindoLinkedListInteiros(listaDeNumeros);

        listaDeNomes.add("Gabriel");
        listaDeNomes.add("Sophia");
        listaDeNomes.add("Arthur");
        listaDeNomes.add("Maycon");
        listaDeNomes.add("Luiz");
        listaDeNomes.add("Nicole");
        listaDeNomes.add("Izabela");
        listaDeNomes.add("Fernando");
        listaDeNomes.add("Igor");
        listaDeNomes.add("Lucas");
        listaDeNomes.add("Nicolas");

        verificandoElementoString(listaDeNomes, "Sophia");

        System.out.println("O elemento chamando " + listaDeNomes.get(4).toString() + " foi removido da lista !!!");
        
        listaDeNomes.remove("Luiz");

        imprimindoLinkedListString(listaDeNomes);
    }

    private static void imprimindoLinkedListString(List<String> listaLigada) {
        System.out.println("\nImprimindo lista completa abaixo: \n");
        for (int e = 0; e < listaLigada.size(); e++) {
            System.out.print(listaLigada.get(e) + ", ");
        }
        System.out.print("Fim.");
        System.out.println("\n");
    }

    private static void imprimindoLinkedListInteiros(List<Integer> listaLigada) {
        System.out.println("\nImprimindo lista completa de numeros abaixo: \n");
        for (int e = 0; e < listaLigada.size(); e++) {
            System.out.print(listaLigada.get(e) + " ");
        }
        System.out.println("\n");
    }

    @SuppressWarnings("unused")
    private static void embaralhandoNumeros(List<Integer> listaLigada, int limite) {
        Random random = new Random();
        int tamanhoArray = listaLigada.size();
        
        while (listaLigada.size() < limite) {
            int numerosAleatorios = random.nextInt(limite);
            if (!listaLigada.contains(numerosAleatorios)) {
                listaLigada.add(numerosAleatorios);
                tamanhoArray++;
            }
        }

    }

    private static void verificandoElementoString(List<String> lista, String elemento) {
        // elemento.equalsIgnoreCase(elemento);
        boolean validacao = lista.contains(elemento);

        if (validacao == true) {
            System.out.print("\nelemento verificado tem na fila !!! elemento: ");
            System.out.println(elemento);
        } else {
            System.out.println("\nelemento verificado nao existe na fila");
        }
        System.out.print("\n");
    }
}