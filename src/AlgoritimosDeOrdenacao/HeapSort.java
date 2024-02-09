package AlgoritimosDeOrdenacao;

import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class HeapSort {

    static int troca = 0;

    public static void main(String[] args) {

        int[] vetor = new int[10];

        embaralhandoNumeros(vetor);

        System.out.println("\nArray desordenando: ");

        ImprimindoArray(vetor);

        HeapSort(vetor);

        System.out.println("\n\nArray ordenando:");
        
        ImprimindoArray(vetor);

        System.out.println("\n");
        
    }

    public static RetornoDeTrocas HeapSort(int[] array) {

        int tamanhoArray = array.length;

        for (int i = tamanhoArray / 2 - 1; i >= 0; i--) {
            aplicarHeap(array, tamanhoArray, i);
        }

        // System.out.println("\n\nArray quase ordenado");
        // ImprimindoArray(array);

        for (int j = tamanhoArray - 1; j > 0; j--) {
            int aux = array[0];
            array[0] = array[j];
            array[j] = aux;
            troca++;

            aplicarHeap(array, j, 0);
        }

        return new RetornoDeTrocas(array, troca);
    }

    private static void aplicarHeap(int[] array, int tamanhoArray, int inteiro) {

        int raiz = inteiro;
        int esquerda = 2 * inteiro + 1;
        int direita = 2 * inteiro + 2;

        if (esquerda < tamanhoArray && array[esquerda] > array[raiz]) {
            raiz = esquerda;
        }
        if (direita < tamanhoArray && array[direita] > array[raiz]) {
            raiz = direita;
        }

        if (raiz != inteiro) {
            int auxiliar = array[inteiro];
            array[inteiro] = array[raiz];
            array[raiz] = auxiliar;
            aplicarHeap(array, tamanhoArray, raiz);
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
