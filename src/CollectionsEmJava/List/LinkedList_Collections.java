package CollectionsEmJava.List;

import java.util.LinkedList;
import java.util.Random;

public class LinkedList_Collections {
    public static void main(String[] args) {

        LinkedList<Integer> listaDeNumeros = new LinkedList<>();
        LinkedList<String> listaDeNomes = new LinkedList<>();

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

        imprimindoLinkedListString(listaDeNomes);
    }

    private static void imprimindoLinkedListString(LinkedList<String> listaLigada) {
        System.out.println("\nImprimindo lista completa abaixo: \n");
        for (int e = 0; e < listaLigada.size(); e++) {
            System.out.print(listaLigada.get(e) + ", ");
        }
        System.out.print("Fim.");
        System.out.println("\n");
    }

    private static void imprimindoLinkedListInteiros(LinkedList<Integer> listaLigada) {
        System.out.println("\nImprimindo lista completa de numeros abaixo: \n");
        for (int e = 0; e < listaLigada.size(); e++) {
            System.out.print(listaLigada.get(e) + " ");
        }
        System.out.println("\n");
    }

    @SuppressWarnings("unused")
    private static void embaralhandoNumeros(LinkedList<Integer> listaLigada, int limite) {
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
}