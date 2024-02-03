package AlgoritimosDeEstruturasDeDados;

public class InsertionSortComString {
    public static void main(String[] args) {

        String[] nomesDePessoas = new String[22];

        nomesDePessoas[0] = "carlos";
        nomesDePessoas[1] = "Oswaldo";
        nomesDePessoas[2] = "Veronica";
        nomesDePessoas[3] = "Barbara";
        nomesDePessoas[4] = "Celso";
        nomesDePessoas[5] = "Tomas";
        nomesDePessoas[6] = "Francisca";
        nomesDePessoas[7] = "Camila";
        nomesDePessoas[8] = "Francianne";
        nomesDePessoas[9] = "Feernanda";
        nomesDePessoas[10]= "Ana";
        nomesDePessoas[11] = "Alice";
        nomesDePessoas[12] = "Daniel";
        nomesDePessoas[13] = "gabriel";
        nomesDePessoas[14] = "gaby";
        nomesDePessoas[15] = "Thiago";
        nomesDePessoas[16]= "Bruna";
        nomesDePessoas[17]= "Paulo";
        nomesDePessoas[18] = "raissa";
        nomesDePessoas[19] = "marina";
        nomesDePessoas[20] = "livia";
        nomesDePessoas[21] = "paula";
        
        System.out.println("lista antes da organizacao: ");
        mostraLista(nomesDePessoas);
        
        System.out.println("\n");

        System.out.println("lista depois da organizacao: ");
        insertionSort(nomesDePessoas);
        mostraLista(nomesDePessoas);
        
        System.out.println("\n");
    }

    private static void insertionSort(String[] arrayDeEntrada){

        int n = arrayDeEntrada.length;

        for (int i = 1; i < n; i++) {
            String chave = arrayDeEntrada[i];
            int j = i - 1;

            // Mova os elementos do arrayDeEntrada[0..i-1] que são maiores que a chave
            // para uma posição à frente de sua posição atual
            while (j >= 0 && arrayDeEntrada[j].compareToIgnoreCase(chave) > 0) {
                arrayDeEntrada[j + 1] = arrayDeEntrada[j];
                j--;
            }

            // Insira a chave na posição correta para funcinar
            arrayDeEntrada[j + 1] = chave;
        }
    }

    private static void mostraLista(String[] lista){
        for(int i =0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
}
