package AlgoritimosDeEstruturasDeDados;

public class Deque_PilhaEmJava {

    // Deque significa "double-ended queue", ou fila de duas extremidades.

    // Interface na biblioteca padrão do Java que estende Queue para fornecer métodos para operações em ambas as extremidades da fila.

    // Permite a inserção e remoção de elementos tanto no início quanto no final da fila.

    // Pode ser usado como uma pilha (LIFO) ou uma fila (FIFO), dependendo da necessidade.

    // addFirst(elemento), offerFirst(elemento): Adiciona um elemento no início da fila.

    // addLast(elemento), offerLast(elemento): Adiciona um elemento no final da fila.

    // removeFirst(), pollFirst(): Remove e retorna o elemento do início da fila.

    // removeLast(), pollLast(): Remove e retorna o elemento do final da fila.

    // getFirst(), peekFirst(): Retorna o elemento do início da fila sem removê-lo.
    
    // getLast(), peekLast(): Retorna o elemento do final da fila sem removê-lo.

    //Quando Usar:
    // Use Deque quando precisar de operações eficientes em ambas as extremidades da fila.
    // Oferece mais flexibilidade do que Stack para situações em que você pode precisar inserir/remover tanto no início quanto no final.

    // Implementações Concretas:
    // ArrayDeque é uma implementação eficiente baseada em array.
    // LinkedList também implementa Deque.

    // Observações:
    // O uso de Deque é preferido sobre Stack, que é uma classe um pouco mais antiga e menos flexível.

    public static void main(String[] args) {

    }
}
