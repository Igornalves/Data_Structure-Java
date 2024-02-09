package ConhecimentoBasico;

public class Recurcividade {

    public static void main(String[] args) {

        int[] vetorArray = new int[10];

        embaralhandoNumeros(vetorArray);

        System.out.println("\n");
        System.out.println("mostrando o array completo: ");
        
        ImprimindoArray(vetorArray);

        System.out.println("\n");

        System.out.println("multiplicacao do array é de: \n" + multi(1, 0, vetorArray));

        System.out.print("\n");

        System.out.println("a soma de todos os valores existentes do array é: \n" + somar(0, 0, vetorArray));

        System.out.println("\n");
    }

    private static int multi(int multiplicacao, int posicao, int[] array) {
        int tamanhoArray = array.length;
        
        if (posicao < tamanhoArray) {
            multiplicacao = multiplicacao * array[posicao];
            return multi(multiplicacao, posicao + 1, array);
        } else {
            return multiplicacao;
        }
    }

    private static int somar(int soma, int posicao, int[] array) {
        if (posicao < array.length) {
            soma = soma + array[posicao];
            return somar(soma, posicao + 1, array);
        } else {
            return soma;
        }
    }

    private static void embaralhandoNumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }

    private static void ImprimindoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
