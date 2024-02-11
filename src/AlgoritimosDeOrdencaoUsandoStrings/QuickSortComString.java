package AlgoritimosDeOrdencaoUsandoStrings;

public class QuickSortComString {
    public static void main(String[] args) {
        
    }

    @SuppressWarnings("unused")
    private static void quickSort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = Particao(array, esquerda, direita);
            quickSort(array, esquerda, pivo);
            quickSort(array, pivo + 1, direita);
        }
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
        }
    }

    @SuppressWarnings("unused")
    private static void embaralhandoNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }

    @SuppressWarnings("unused")
    private static void ImprimindoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
