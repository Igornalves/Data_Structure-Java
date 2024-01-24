package Vetores_Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        System.out.println("numeros do vetor desordenados: \n");

        //embaralhando com numenros aleatorios 
        for(int i =0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        System.out.print("\n\n");

        long inicio = System.currentTimeMillis();
        long fim;

        // Insertion Sort estrutura de dados O(n²)
        int aux;
        int j;
        for(int i =1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;   
        }

        fim = System.currentTimeMillis();

        System.out.print("\n\n");

        System.out.println("numeros da vetor ordenados: \n");

        for (int r = 0; r < vetor.length; r++) {
            System.out.println(vetor[r]);
        }

        System.out.print("\n");

        System.out.println("Tempo de execução da Ordenação: " + (fim - inicio) + " milisegundos");

        System.out.print("\n\n");
    }
}
