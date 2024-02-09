package AlgoritimosDeOrdencaoUsandoStrings;

public class HeapSortComString {
    public static void main(String[] args) {

        String[] objetosDeCasa = new String[22];

        objetosDeCasa[0] = "Desodorante";
        objetosDeCasa[1] = "Ovos";
        objetosDeCasa[2] = "Verduras";
        objetosDeCasa[3] = "Batatas";
        objetosDeCasa[4] = "Cenoura";
        objetosDeCasa[5] = "Tomate";
        objetosDeCasa[6] = "Frutas";
        objetosDeCasa[7] = "Carne";
        objetosDeCasa[8] = "Frango";
        objetosDeCasa[9] = "Frango";

        objetosDeCasa[10]= "Açúcar";
        objetosDeCasa[11] = "Arroz";
        objetosDeCasa[12] = "Feijão";
        objetosDeCasa[13] = "Oleo";
        objetosDeCasa[14] = "Macarrão";
        objetosDeCasa[15] = "Farinha de Trigo";

        objetosDeCasa[16]= "Biscoito";
        objetosDeCasa[17]= "Pães";
        objetosDeCasa[18] = "Frios";
        objetosDeCasa[19] = "Manteiga";
        objetosDeCasa[20] = "Café";
        objetosDeCasa[21] = "Iogurtes";

        System.out.println("\n");
        System.out.println("imprimindo a lista nao ordenada: ");
        ImprimindoArray(objetosDeCasa);

        HeapSort(objetosDeCasa);
        System.out.println("\n");
        
        System.out.println("Imprimindo a lista ordenada usando HeapSort: ");
        ImprimindoArray(objetosDeCasa);
        System.out.println("\n\n");
        
    }

    private static void HeapSort(String[] array) {

        int tamanhoArray = array.length;

        for (int i = tamanhoArray / 2 - 1; i >= 0; i--) {
            aplicarHeap(array, tamanhoArray, i);
        }

        System.out.println("\n\nArray quase ordenado");
        ImprimindoArray(array);

        for (int j = tamanhoArray - 1; j > 0; j--) {

            String aux = array[0];
            array[0] = array[j];
            array[j] = aux;

            aplicarHeap(array, j, 0);
        }
    }

    private static void aplicarHeap(String[] array, int tamanhoArray, int inteiro) {

        int raiz = inteiro;
        int esquerda = 2 * inteiro + 1;
        int direita = 2 * inteiro + 2;

        if (esquerda < tamanhoArray && array[esquerda].compareToIgnoreCase(array[raiz]) > 0) {
            raiz = esquerda;
        }
        if (direita < tamanhoArray && array[direita].compareToIgnoreCase(array[raiz]) > 0) {
            raiz = direita;
        }

        if (raiz != inteiro) {
            String auxiliar = array[inteiro];
            array[inteiro] = array[raiz];
            array[raiz] = auxiliar;

            aplicarHeap(array, tamanhoArray, raiz);
        }
    }

    private static void ImprimindoArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
