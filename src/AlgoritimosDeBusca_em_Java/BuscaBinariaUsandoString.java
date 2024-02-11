package AlgoritimosDeBusca_em_Java;

import java.util.Scanner;

public class BuscaBinariaUsandoString {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] estadosDoBrasil = new String[11];

        estadosDoBrasil[0] = "Minas gerais";
        estadosDoBrasil[1] = "Bahia";
        estadosDoBrasil[2] = "Goias";
        estadosDoBrasil[3] = "Parana";
        estadosDoBrasil[4] = "Piaui";
        estadosDoBrasil[5] = "Santa Catarina";
        estadosDoBrasil[6] = "Sao Paulo";
        estadosDoBrasil[7] = "Ceara";
        estadosDoBrasil[8] = "Pernambuco";
        estadosDoBrasil[9] = "Amazonas";
        estadosDoBrasil[10] = "Maranhao";

        System.out.print("\n");

        System.out.print("Digite o nome do Estado que vc deseja procura na lista: ");
        String nomeDoEstado = input.nextLine();

        BuscaBinariaComVetorUsandoString(estadosDoBrasil, nomeDoEstado);

        System.out.println("\n");

    }

    private static void BuscaBinariaComVetorUsandoString(String[] array, String palavraBuscada) {

        int contador = 0;
        boolean pesquisado = false;
        int inicio = 0;
        int fim = array.length;
        int meio;

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++; // conta a quantidade de testes realizandos no programa
            if (array[meio].equalsIgnoreCase(palavraBuscada)) {
                pesquisado = true;
                break;
            } else if (array[meio].compareToIgnoreCase(palavraBuscada) <= 0) {
                inicio = meio + 1;
            } else { // só pode ser maior o numero procurando pelo usuario
                fim = meio - 1;
            }
        }

        System.out.print("\n\n");
        System.out.println("quantidade de testes realizandos no programa: " + contador);
        if (pesquisado == true) {
            System.out.print("\n");
            System.out.println("Foi encontrando na lista o que vc estar procurando que no caso é: " + palavraBuscada);

            System.out.print("\nImprimindo a lista completa para vc: \n");
            imprimindoArrayString(array);

        } else {
            System.out.print("\n\n");
            System.out.println("infelizmente não achamos o que vc estava procurado !!!");
        }
    }

    private static void imprimindoArrayString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
