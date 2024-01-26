package AlgoritimosDeEstruturasDeDados;

public class Recurcividade {

    public static void main(String[] args) {

        int[] vetorArray = new int[10];

        for (int i = 0; i < vetorArray.length; i++) {
            vetorArray[i] = (int) (Math.random() * 20);
        }

        for (int i = 0; i < vetorArray.length; i++) {
            System.out.println(vetorArray[i]);
        }

        System.out.println("\n");

        System.out.println("multiplicacao do array é de: \n" + multi(1, 0, vetorArray));

        System.out.println("\n");

        System.out.println("a soma de todos os valores existentes do array é: \n" + somar(0, 0, vetorArray));

        System.out.println("\n");
    }

    public static int multi(int multiplicacao, int posicao, int[] array) {
        if (posicao < array.length) {
            multiplicacao = multiplicacao * array[posicao];
            return multi(multiplicacao, posicao + 1, array);
        } else {
            return multiplicacao;
        }
    }

    public static int somar(int soma, int posicao, int[] array) {
        if (posicao < array.length) {
            soma = soma + array[posicao];
            return somar(soma, posicao + 1, array);
        } else {
            return soma;
        }
    }
}
