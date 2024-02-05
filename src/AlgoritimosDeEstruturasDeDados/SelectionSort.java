package AlgoritimosDeEstruturasDeDados;

public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        
        System.out.print("\n");

        System.out.println("numeros do vetor desordenados: \n");

        // embaralhando com numenros aleatorios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(" "+vetor[i]);
        }

        System.out.print("\n");

        long inicio = System.currentTimeMillis();
        long fim;

        // Selection Sort estrutura de dados O(n²)
        int posicao_menor;
        int aux;
        for (int h = 0; h < vetor.length; h++) {
            posicao_menor = h;
            for (int j = h + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[h];
            vetor[h] = aux;
        }

        fim = System.currentTimeMillis();
        System.out.print("\n");

        System.out.println("numeros da vetor ordenados: \n");
        for (int r = 0; r < vetor.length; r++) {
            System.out.print(" "+vetor[r]);
        }
        System.out.print("\n\n");

        System.out.println("Tempo de execução da Ordenação: " + (fim - inicio) + " milisegundos");
        System.out.print("\n\n");

    }
}