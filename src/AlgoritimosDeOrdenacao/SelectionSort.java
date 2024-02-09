package AlgoritimosDeOrdenacao;

import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        
        System.out.print("\n");

        System.out.println("numeros do vetor desordenados: ");

        // embaralhando com numenros aleatorios
        embaralhandoNumeros(vetor);
        ImprimindoArray(vetor);

        System.out.print("\n");

        long inicio = System.currentTimeMillis();
        long fim;

        SelectionSort(vetor);

        fim = System.currentTimeMillis();
        System.out.print("\n");

        System.out.println("numeros da vetor ordenados: ");
        ImprimindoArray(vetor);
        System.out.print("\n\n");

        System.out.println("Tempo de execução da Ordenação: " + (fim - inicio) + " milisegundos");
        System.out.print("\n\n");

    }

    public static RetornoDeTrocas SelectionSort(int[] array){
        // Selection Sort estrutura de dados O(n²)
        int posicao_menor;
        int troca = 0;
        int aux;
        for (int h = 0; h < array.length; h++) {
            posicao_menor = h;
            for (int j = h + 1; j < array.length; j++) {
                if (array[j] < array[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = array[posicao_menor];
            array[posicao_menor] = array[h];
            array[h] = aux;
            troca++;
        }

        return new RetornoDeTrocas(array, troca);
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