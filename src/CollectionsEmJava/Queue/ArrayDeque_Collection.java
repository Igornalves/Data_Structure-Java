package CollectionsEmJava.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_Collection {

    //implementacao de fila usando ArrayDeque

    //nesse caso pode-se inserir ou remover de ambas a extremidades da fila implementando o Deque 

    public static void main(String args[]) {

        Deque<String> minhaFila = new ArrayDeque<>();

        verificandoSeFilaEstarVazia(minhaFila);

        adcionadoString(minhaFila, "Azul");
        adcionadoString(minhaFila, "Roxo");
        adcionadoString(minhaFila, "Vermelho");
        adcionadoString(minhaFila, "Laranja");
        adcionadoString(minhaFila, "Violeta");
        adcionadoString(minhaFila, "Cinza");
        adcionadoString(minhaFila, "Branco");
        adcionadoString(minhaFila, "Verde");
        adcionadoString(minhaFila, "Rosa");

        imprimindo(minhaFila);

        verificandoSeFilaEstarVazia(minhaFila);

        verificandoElementoString(minhaFila, "Branco");

        colocandoElementoStringNoInicio(minhaFila, "Braco");

        imprimindo(minhaFila);

        removendoElemento(minhaFila, "Rosa");

        imprimindo(minhaFila);

        colocandoElementoStringNoFinal(minhaFila, "Azul");

        ultimoElementoDaFila(minhaFila);

        imprimindo(minhaFila);

        // colocandoTodosElementosStringNoFinal(minhaFila);

        // imprimindo(minhaFila);

    }

    private static void adcionadoString(Deque<String> fila, String elemento) {
        fila.add(elemento);
        // System.out.println("Adcionado com sucusso !!!");
    }

    private static void imprimindo(Deque<String> fila) {
        int tamanho = fila.size();
        String[] elemento = fila.toArray(new String[0]);

        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elemento[i] + " ");
        }
        System.out.println("\n");
    }

    private static void verificandoElementoString(Deque<String> fila, String elemento) {
        // elemento.equalsIgnoreCase(elemento);
        boolean validacao = fila.contains(elemento);

        if (validacao == true) {
            System.out.print("\nelemento verificado tem na fila !!! elemento: ");
            System.out.println(elemento);
        } else {
            System.out.println("\nelemento verificado nao existe na fila");
        }
        System.out.print("\n");
    }

    @SuppressWarnings("unused")
    private static void colocandoTodosElementosStringNoFinal(Deque<String> fila){
        fila.addAll(fila);
        System.out.println("elementos foram para o final do deque !!!");
    }

    private static void colocandoElementoStringNoInicio(Deque<String> fila, String elemento) {
        fila.offerFirst(elemento);
        System.out.println("\nelemento (" + elemento + ") foi colocando no inicio da deque !!!!");
    }

    private static void colocandoElementoStringNoFinal(Deque<String> fila, String elemento) {
        fila.offerLast(elemento);
        System.out.println("\nelemento " + elemento + " foi colocando do final da deque");
    }

    private static void removendoElemento(Deque<String> fila, String elemento) {
        fila.remove(elemento);
        System.out.println("\nelemento removido com sucesso !!!");
    }

    private static void verificandoSeFilaEstarVazia(Deque<String> fila) {
        boolean filaVazia = fila.isEmpty();

        if (filaVazia == true) {
            System.out.println("\nfila esta vazia !!!");
        } else {
            System.out.println("\nfila nao esta vazia, ela tem elementos !!!");
        }
    }

    private static void ultimoElementoDaFila(Deque<String> fila) {
        String ultimoElemento = fila.peekLast();
        System.out.println("\nO ultimo elemento da fila e: " + ultimoElemento);
    }
}
