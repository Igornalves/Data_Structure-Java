package AlgoritimosDeOrdenacao;

import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class BubbleSort {
    public static void main(String[] args) {

        int[] vetor = new int[15];

        System.out.print("\n\n");

        System.out.println("numeros do vetor desordenados: ");

        // embaralhando com numeros aleatorios
        embaralhandoNumeros(vetor);

        ImprimindoArray(vetor);

        System.out.print("\n\n");

        long inicio = System.currentTimeMillis();
        long fim;

        // BUBBLE SORT estrutura de dados tipo O(n²)
        BubbleSort(vetor);

        fim = System.currentTimeMillis();

        System.out.println("numeros da vetor ordenados: ");

        ImprimindoArray(vetor);

        System.out.print("\n\n");

        System.out.println("Tempo de execução da Ordenação: " + (fim - inicio) + " milisegundos");

        System.out.print("\n\n");
    }

    public static RetornoDeTrocas BubbleSort(int[] array) {
        int troca = 0;
        int aux;
        for (int i = 0; i < array.length; i++) { // O(N)
            for (int j = i + 1; j < array.length; j++) { // O(N)
                if (array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                    troca++;
                }
            }
        }

        return new RetornoDeTrocas(array, troca);
    }

    private static void ImprimindoArray(int[] array) {
        for (int r = 0; r < array.length; r++) {
            System.out.print(array[r] + " ");
        }
    }

    private static void embaralhandoNumeros(int[] array) {
        for (int r = 0; r < array.length; r++) {
            array[r] = (int) (Math.random() * 50);
        }
    }
}
