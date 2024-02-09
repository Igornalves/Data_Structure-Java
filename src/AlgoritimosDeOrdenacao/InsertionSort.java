package AlgoritimosDeOrdenacao;

import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class InsertionSort {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        System.out.print("\n\n");

        System.out.println("numeros do vetor desordenados: ");

        // embaralhando com numeros aleatorios 
        embaralhandoNumeros(vetor);

        long inicio = System.currentTimeMillis();
        long fim;

        // Insertion Sort estrutura de dados O(n²)
        InsertionSort(vetor);

        fim = System.currentTimeMillis();

        System.out.print("\n\n");

        System.out.println("numeros da vetor ordenados: ");

        ImprimindoArray(vetor);

        System.out.print("\n\n");

        System.out.println("Tempo de execução da Ordenação: " + (fim - inicio) + " milisegundos");

        System.out.print("\n\n");
    }


    public static RetornoDeTrocas InsertionSort(int[] array){
        int troca =0;
        int aux;
        int j;
        for(int i =1; i < array.length; i++){
            aux = array[i];
            j = i-1;
            while (j >= 0 && array[j] > aux) {
                array[j+1] = array[j];
                j--;
                troca++;
            }
            array[j+1] = aux;   
            troca++;
        }

        return new RetornoDeTrocas(array, troca);
    }

    private static void embaralhandoNumeros(int[] array){
        for(int i =0; i < array.length; i++){
            array[i] = (int) (Math.random() * array.length);
            System.out.print(array[i]+" ");
        }
    }

    public static void ImprimindoArray(int[] array){
        for (int r = 0; r < array.length; r++) {
            System.out.print(array[r]+" ");
        }
    }
}
