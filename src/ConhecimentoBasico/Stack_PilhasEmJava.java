package ConhecimentoBasico;

import java.util.Stack;

public class Stack_PilhasEmJava {

    // Stack é um metodo usado dentro do java para organizar itens em forma de pilha
    // eem estrutura de dados

    // Ela estende a classe Vector com métodos que permitem que um vetor seja
    // tratado como uma pilha.

    // Os elementos são adicionados e removidos da pilha pelo topo (LIFO - Last In,
    // First Out).

    // O topo da pilha é o último elemento adicionado.

    // É uma classe genérica, o que significa que pode armazenar qualquer tipo de
    // objeto.

    // push(elemento): Adiciona um elemento ao topo da pilha.

    // pop(): Remove e retorna o elemento do topo da pilha.

    // peek(): Retorna o elemento do topo sem removê-lo.

    // empty(): Retorna true se a pilha estiver vazia, false caso contrário.

    // search(elemento): Retorna a posição de um elemento na pilha, contando do
    // topo. Retorna -1 se o elemento não estiver na pilha.

    public static void main(String[] args) {

        Stack<String> nomes = new Stack<String>();

        // Adicionando elementos
        nomes.push("Amanda");
        nomes.push("Bianca");
        nomes.push("Carla");
        nomes.push("Geovanna");
        nomes.push("Sabrina");
        nomes.push("Sophia");
        nomes.push("Eduardo");

        System.out.println("pilha com todos os nomes aqui em baixo:");
        System.out.println();

        // for (int i = 0; i < nomes.size(); i++) {
        // System.out.println(nomes.get(i));
        // }

        System.out.println("conteudo existente da pilha: " + nomes);

        System.out.println("\n");


        // System.out.println(nomes.isEmpty()?"aqui esta a pilha cheia estarei imprimindo ai em baixo para vc ":"a pilha não estar cheia senhor !!!!");

        if (nomes.isEmpty() == true) {
            System.out.println("a pilha não estar cheia senhor !!!!");
        } else {
            System.out.println("aqui esta a pilha cheia estarei imprimindo ai em baixo para vc ");
        }

        System.out.println("\n");
        // Consultando o topo
        String topoAtual = nomes.peek();
        System.out.println("Topo da pilha: " + topoAtual);
        System.out.println("conteudo existente da pilha: " + nomes);
        System.out.println("\n");

        // Removendo o topo
        String topo = nomes.pop();
        System.out.println("Elemento removido: " + topo);
        System.out.println("conteudo existente da pilha: " + nomes);
        System.out.println("\n");
    }

}