package lista_ligada_estrutura_de_dados.App;

import lista_ligada_estrutura_de_dados.Class.ListaLigado;

public class Principal {
    public static void main(String[] args) {

        ListaLigado lista = new ListaLigado();

        lista.adicionar("jose");
        lista.adicionar("matheus");
        lista.adicionar("gabriel");
        lista.adicionar("sophia");

        System.out.print("\n");

        System.out.println("tamanho da lista é de: "+ lista.getTamanho() + " \neste são todos os objetos que estão na lista do programa\n");

        System.out.println("Primeiro valor adcionados na lista: "+lista.getPrimeiro().getValor()
        );
        System.out.println("Ultimo valor adcionados na lista: "+lista.getUltimo().getValor()
        );

        // for(int i =0; i < lista.getTamanho() ; i++ ){
        //     System.out.println(lista.get(i));
        // }


        System.out.print("\n");
    }
}
