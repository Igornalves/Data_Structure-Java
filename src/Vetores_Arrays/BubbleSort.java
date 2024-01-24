package Vetores_Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] vetor = new int[15];

        System.out.println("numeros do vetor desordenados: \n");

        //embaralhando com numeros aleatorios 
        for (int r = 0; r < vetor.length; r++) {
            vetor[r] = (int) (Math.random() * 50);
            System.out.println(vetor[r]);
        }

        System.out.print("\n\n");

        long inicio = System.currentTimeMillis();
        long fim;

        // BUBBLE SORT estrutura de dados tipo O(n²)
        int aux;
        for (int i = 0; i < vetor.length; i++) { // O(N)
            for (int j = i + 1; j < vetor.length; j++) { // O(N)
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
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
