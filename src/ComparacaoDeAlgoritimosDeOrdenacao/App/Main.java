package ComparacaoDeAlgoritimosDeOrdenacao.App;

import AlgoritimosDeOrdenacao.BubbleSort;
import AlgoritimosDeOrdenacao.HeapSort;
import AlgoritimosDeOrdenacao.InsertionSort;
import AlgoritimosDeOrdenacao.QuickSort;
import AlgoritimosDeOrdenacao.SelectionSort;
import AlgoritimosDeOrdenacao.ShellSort;
import ComparacaoDeAlgoritimosDeOrdenacao.RetornoDeTrocas;

public class Main {
    public static void main(String[] args) {

        long inicio, fim;
        RetornoDeTrocas retorno;
        int[] arrayInicial = new int[10000];

        embaralhandoNumeros(arrayInicial);

        System.out.println("\n\nFazendo a comparacao do algoritimos de ordenacao: ");

        System.out.println("\nMetodo BubbleSort");
        inicio = System.currentTimeMillis();
        retorno = BubbleSort.BubbleSort(arrayInicial.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execucao: " + (fim - inicio) + " Ms");
        System.out.println("Quantidade de Trocas Realizadas: " + retorno.getTrocas());
        
        System.out.println("\nMetodo InsertionSort");
        inicio = System.currentTimeMillis();
        retorno = InsertionSort.InsertionSort(arrayInicial.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execucao: " + (fim - inicio) + " Ms");
        System.out.println("Quantidade de Trocas Realizadas: " + retorno.getTrocas());

        System.out.println("\nMetodo SelectionSort");
        inicio = System.currentTimeMillis();
        retorno = SelectionSort.SelectionSort(arrayInicial.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execucao: " + (fim - inicio) + " Ms");
        System.out.println("Quantidade de Trocas Realizadas: " + retorno.getTrocas());
   
        System.out.println("\nMetodo ShellSort");
        inicio = System.currentTimeMillis();
        retorno = ShellSort.ShellSort(arrayInicial.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execucao: " + (fim - inicio) + " Ms");
        System.out.println("Quantidade de Trocas Realizadas: " + retorno.getTrocas());
        
        System.out.println("\nMetodo HeapSort");
        inicio = System.currentTimeMillis();
        retorno = HeapSort.HeapSort(arrayInicial.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execucao: " + (fim - inicio) + " Ms");
        System.out.println("Quantidade de Trocas Realizadas: " + retorno.getTrocas());

        System.out.println("\nMetodo QuickSort");
        inicio = System.currentTimeMillis();
        retorno = QuickSort.QuickSort(arrayInicial.clone(), 0 , arrayInicial.length - 1);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execucao: " + (fim - inicio) + " Ms");
        System.out.println("Quantidade de Trocas Realizadas: " + retorno.getTrocas());

        System.out.println("\n");
    }

    private static void embaralhandoNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }

    /**
     * metodo que imprime um array ou vetor de forma completa 
     * 
     * @deprecated metodo nao pode ser utilizado 
     * 
     * @see static void embaralhandoNumeros(int[] array)
     */

    @SuppressWarnings("unused")
    private static void ImprimindoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
