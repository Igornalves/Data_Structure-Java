package ComparacaoDeEstruturas;

import java.util.ArrayList;
import java.util.LinkedList;
import Lista_Ligada_Generica.Class.ListaLigada;

public class Comparacao {
    public static void main(String[] args) {
        
        LinkedList<Integer> lista = new LinkedList<Integer>();
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ListaLigada<Integer> listaGenerica = new ListaLigada<Integer>();

        int limite = 10000000;

        //Tempo no qual é adcionado em uma Lista ligada da Biblioteca LinkedList

        long tempoInicial = System.currentTimeMillis();
        for(int i =0; i < limite; i++){
            lista.add(i);
        }
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Foi adcionando na lista do (LinkedList) todos estes numeros "+ limite );
        System.out.print("O tempo em milisegundos foi de: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");
        
        //tempo de adcionamento de Vetor (ArrayList)
        
        tempoInicial = System.currentTimeMillis();
        for(int i =0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        
        System.out.println("Foi adcionando no vetor do (ArrayList) todos estes numeros "+ limite);
        System.out.print("O tempo em milisegundos foi de: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");
        
        //tempo de adcionamento da lista ligada generica feita aqui por mim 
        
        tempoInicial = System.currentTimeMillis();
        for(int i =0; i < limite; i++){
            listaGenerica.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();
        
        System.out.println("Foi adcionando na lista Generica da (Lista Ligada Generica) todos estes numeros "+ limite);
        System.out.print("O tempo em milisegundos foi de: ");
        System.out.print(tempoFinal - tempoInicial);
        System.out.print("\n\n\n");
    }
}
