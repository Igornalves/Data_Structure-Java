package AlgoritimosDeEstruturasDeDados;

public class BubbleSortComString {
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
        objetosDeCasa[13] = "Óleo";
        objetosDeCasa[14] = "Macarrão";
        objetosDeCasa[15] = "Farinha de Trigo";

        objetosDeCasa[16]= "Biscoito";
        objetosDeCasa[17]= "Pães";
        objetosDeCasa[18] = "Frios";
        objetosDeCasa[19] = "Manteiga";
        objetosDeCasa[20] = "Café";
        objetosDeCasa[21] = "Iogurtes";

        System.out.println("lista antes da ordenacao: \n");

        imprimirArray(objetosDeCasa);
        
        System.out.print("\n\n");
        
        long inicio = System.currentTimeMillis();
        long fim;

        System.out.println("Depois da ordenacao da lista:\n");

        bubbleSort(objetosDeCasa);
        imprimirArray(objetosDeCasa);

        //vc pode usar o metodo Arrays.sort para organizar seu algoritimo de forma mais liner possivel   

        // Arrays.sort(objetosDeCasa);

        // for (int i = 0; i < objetosDeCasa.length; i++) {
        //     System.out.println(objetosDeCasa[i]);
        // }

        fim = System.currentTimeMillis();

        System.out.print("\n\n");

        System.out.println("Tempo de execução da Ordenação: " + (fim - inicio) + " milisegundos");

        System.out.print("\n\n");

    }


    private static void bubbleSort(String[] arrayDeEntrada) {
        int n = arrayDeEntrada.length;
        boolean trocou;

        do {
            trocou = false;

            for (int i = 0; i < n - 1; i++) {
                if (arrayDeEntrada[i].compareToIgnoreCase(arrayDeEntrada[i + 1]) > 0) {
                    // Troca os elementos se estiverem fora de ordem
                    String temp = arrayDeEntrada[i];
                    arrayDeEntrada[i] = arrayDeEntrada[i + 1];
                    arrayDeEntrada[i + 1] = temp;
                    trocou = true;
                }
            }

        } while (trocou);
    }

    private static void imprimirArray(String[] arrayDeEntrada) {
        for (String nome : arrayDeEntrada) {
            System.out.println(nome);
        }
    }


}
