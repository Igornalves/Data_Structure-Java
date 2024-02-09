package ComparacaoDeListas;

import java.util.ArrayList;
import java.util.LinkedList;
import Lista_Ligada_Generica.Class.IteratorListaLigada;
import Lista_Ligada_Generica.Class.ListaLigada;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<Integer>();
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ListaLigada<Integer> listaGenerica = new ListaLigada<Integer>();

        int limite = 10000;

        // Tempo no qual é adcionado em uma Lista ligada da Biblioteca LinkedList

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            lista.add(i);
        }
        long tempoFinal = System.currentTimeMillis();

        System.out.println("\n\nFoi adcionando na lista do (LinkedList) todos estes numeros: " + limite);
        System.out.print("O tempo em milisegundos foi de: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");

        // tempo de adcionamento de Vetor (ArrayList)

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Foi adcionando no vetor do (ArrayList) todos estes numeros: " + limite);
        System.out.print("O tempo em milisegundos foi de: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");

        // tempo de adcionamento da lista ligada generica feita aqui por mim

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            listaGenerica.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out
                .println("Foi adcionando na lista Generica da (Lista Ligada Generica) todos estes numeros: " + limite);
        System.out.print("O tempo em milisegundos foi de: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");

        // tempo de leitura do LinkedList

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("O tempo de leitura do LinkedList em milisegundos: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n");

        // tempo de leitura do Vetor (ArrayList)

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("O tempo de leitura do Vetor (ArrayList) em milisegundos: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n");

        // tempo de leitura do lista ligada generica feita aqui por mim

        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = listaGenerica.getIterator();
        while(iterator.temProximo()) {
            iterator.getProximo();
        }
        for (int i = 0; i < listaGenerica.getTamanho(); i++) {
            listaGenerica.get(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.print("O tempo de leitura do lista ligada generica em milisegundos: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");
    }
}
