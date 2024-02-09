package AlgoritimosDeOrdenacao;

import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class ShellSort {
    public static void main(String[] args) {

        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("\n\nimprimindo o vetor sem ordenacao: ");

        for (int i : vetor) {
            System.out.print(vetor[i] + " ");
        }

        ShellSort(vetor);

        System.out.println("\n\nImprimindo o vetor ordenado usando ShellSort: ");

        for (int i : vetor) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n");
        
    }

    public static RetornoDeTrocas ShellSort(int[] array) {

        int h = 1;
        int troca =0;
        int n = array.length;

        while (h < n) {
            h = h * 3 + 1;
        }

        h = (int) Math.floor(h / 3);

        int elemento, aux;

        while (h > 0) {

            for (int i = h; i < n; i++) {
                elemento = array[i];
                aux = i;

                while (aux >= h && array[aux - h] > elemento) {
                    array[aux] = array[aux - h];
                    aux = aux - h;
                    troca++;
                }
                array[aux] = elemento;
                troca++;
            }
            h = h / 2;
        }
        return new RetornoDeTrocas(array, troca);
    }
}
