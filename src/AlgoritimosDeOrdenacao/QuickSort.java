package AlgoritimosDeOrdenacao;

import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class QuickSort {

    static int troca = 0;

    public static void main(String[] args) {

        int[] vetor = new int[20];

        embaralhandoNumeros(vetor);

        System.out.println("\n");
        
        System.out.println("imprimindo o array desordenando");
        ImprimindoArray(vetor);
        
        System.out.println("\n");
        
        QuickSort(vetor, 0, vetor.length - 1);
        
        System.out.println("imprimindo o array ordenando usando o QuickSort");
        ImprimindoArray(vetor);
        
        System.out.println("\n");
    }

    public static RetornoDeTrocas QuickSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = Particao(array, esquerda, direita);
            QuickSort(array, esquerda, pivo);
            QuickSort(array, pivo + 1, direita);
        }
        return new RetornoDeTrocas(array, troca);
    }

    private static int Particao(int[] array, int esquerda, int direita) {

        int meio = (int) (esquerda + direita) / 2;
        int pivo2 = array[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        int aux;

        while (true) {
            do {
                i++;
            } while (array[i] < pivo2);
            do {
                j--;
            } while (array[j] > pivo2);
            if (i >= j) {
                return j;
            }
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            troca++;
        }
    }

    private static void embaralhandoNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }

    private static void ImprimindoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
