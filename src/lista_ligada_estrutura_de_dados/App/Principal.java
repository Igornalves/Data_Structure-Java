package lista_ligada_estrutura_de_dados.App;

import lista_ligada_estrutura_de_dados.Class.ListaLigado;

public class Principal {
    public static void main(String[] args) {

        ListaLigado lista = new ListaLigado();

        lista.adicionar("jose");
        lista.adicionar("matheus");
        lista.adicionar("gabriel");
        lista.adicionar("sophia");
        lista.adicionar("pedro");
        lista.adicionar("maycon");
        lista.adicionar("Eloa");
        lista.adicionar("Cristal");
        lista.adicionar("Cesar");
        lista.adicionar("Catarina");
        lista.adicionar("Alice");

        System.out.print("\n");

        System.out.println("tamanho da lista é de: " + lista.getTamanho() + " pessoas ou objeto");

        System.out.print("\n\n");

        System.out.println("Primeiro valor adcionados na lista: " + lista.getPrimeiro().getValor());

        // System.out.print("\n");

        System.out.println("Ultimo valor adcionados na lista: " + lista.getUltimo().getValor());

        System.out.print("\n\n");

        System.out.println("Este são todas as pessoas ou objetos que estão na lista do programa:\n");

        //olhando todos que estão na lista usando um loop 

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(i + ". " + lista.get(i).getValor());
        }

        System.out.print("\n");

        //fazendo uma busca liner na lista ligada:

        
    }
}
