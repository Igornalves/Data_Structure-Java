package Vetores_Arrays;

import java.util.Scanner;

public class BuscaBinariaComVetorUsandoInteiros {
    public static void main(String[] args) {

        //busca do tipo O(log n)

        Scanner input = new Scanner(System.in);
        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            // vetor[i] = (int) (Math.random() * 1000);
            // System.out.println(vetor[i]);
        }

        System.out.print("\n");
        System.out.print("Qual numero vc estar procurando ??? ");
        int buscado = input.nextInt();
        
        int contador = 0;
        boolean pesquisado = false;
        int inicio = 0;
        int fim = vetor.length;
        int meio;
        
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++; //conta a quantidade de testes realizandos no programa 
            if (vetor[meio] == buscado) {
                pesquisado = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
                
            } else { //só pode ser maior o numero procurando pelo usuario 
                fim = meio - 1;
            }
        }
        
        System.out.print("\n\n");
        System.out.println("quantidade de testes realizandos no programa: " + contador);
        if (pesquisado == true) {
            System.out.print("\n");
            System.out.println("Foi encontrando o numero que vc estar procurando que no caso é " + buscado);
        }
        else{
            System.out.print("\n\n");
            System.out.println("infelizmente não achamos o numero procurado");
        }
        
        System.out.print("\n\n");
    }
}
