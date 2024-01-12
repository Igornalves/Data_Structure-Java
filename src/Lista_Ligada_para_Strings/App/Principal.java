package Lista_Ligada_para_Strings.App;

import Lista_Ligada_para_Strings.Class.ListaLigado;

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

        //removendo pessoas da lista 

        System.out.println("removendo algumas pessoas da lista como nome de: "+ lista.get(0).getValor() + " e " + lista.get(4).getValor() + ".\n");
        
        lista.remover("pedro");
        lista.remover("jose");

        System.out.println("removidos com sucesso: ok !!!\n");

        System.out.println("tamanho da lista é de: " + lista.getTamanho() + " pessoas ou objeto \n");
        
        System.out.println("imprimindo todas as pessoas da lista abaixo: \n");

        for(int i = 0; i < lista.getTamanho(); i++){
            System.out.println(i + ". " + lista.get(i).getValor());
        }

        System.out.print("\n");
        
    }
}
