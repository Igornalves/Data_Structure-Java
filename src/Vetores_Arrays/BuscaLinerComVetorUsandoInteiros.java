package Vetores_Arrays;

import java.util.Scanner;

public class BuscaLinerComVetorUsandoInteiros {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // busca do tipo O(n)

        int[] vetor = new int[10];

        vetor[0] = 20;
        vetor[1] = 44;
        vetor[2] = 54;
        vetor[3] = 77;
        vetor[4] = 8;
        vetor[5] = 5;
        vetor[6] = 21;
        vetor[7] = 23;
        vetor[8] = 53;
        vetor[9] = 0;

        System.out.print("Digite o numero no qual vc estar procurando: ");
        int valorProcurando = input.nextInt();

        boolean buscador = false;
        for(int i =0; i < vetor.length; i++){

            int elemento = vetor[i];

            if (elemento == valorProcurando) {
                buscador = true;
                break;
            }
        }

        if (buscador == true) {
            System.out.print("\n\n");
            System.out.println("O item procurado por vc em nosso sisteema existe !!!!!!!");
            System.out.println("estarei colocando aqui abaixo a nossa lista de numeros: ");
            System.out.print("\n");
            
            for(int u = 0; u < vetor.length; u++){
                System.out.println(vetor[u]);
            }
            System.out.print("\n\n");
        }else{
            System.out.print("\n\n");
            System.out.println("Infelizmente não temos o valor de sua procura em nossa lista.");
            System.out.print("\n");
        }
    }
}
