package Vetores_Arrays;

import java.util.Scanner;

public class BuscaLinearComVetorUsandoString {
    public static void main(String[] args) {

        //busca do tipo O(n)

        Scanner input = new Scanner(System.in);

        String[] estadosDoBrasil = new String[11];

        estadosDoBrasil[0] = "Minas gerais" ;
        estadosDoBrasil[1] = "Bahia" ;
        estadosDoBrasil[2] = "Goias" ;
        estadosDoBrasil[3] = "Parana" ;
        estadosDoBrasil[4] = "Piaui" ;
        estadosDoBrasil[5] = "Santa Catarina" ;
        estadosDoBrasil[6] = "Sao Paulo" ;
        estadosDoBrasil[7] = "Ceara" ;
        estadosDoBrasil[8] = "Pernambuco" ;
        estadosDoBrasil[9] = "Amazonas" ;
        estadosDoBrasil[10] = "Maranhao" ;
        
        System.out.print("Digite o nome do Estado que vc deseja procura na lista: ");
        String nomeDoEstado = input.nextLine();
        
        System.out.print("\n");
        
        //busca linear 
        
        boolean busca = false;
        
        for(int g = 0; g < estadosDoBrasil.length ; g++){
            
            String elemento = estadosDoBrasil[g];
            
            if (elemento.equalsIgnoreCase(nomeDoEstado)) {
                busca = true;
                break;
            }
        }
        
        if (busca == true) {
            System.out.print("O estado da " + nomeDoEstado + " Existe em nossa lista de estados !!!!");
            System.out.print("\n\n");
            System.out.println("Veja a Lista com todos os estados: \n");

            for(int n = 0 ; n < estadosDoBrasil.length ; n++){
                System.out.println("Estado " + n + ": " + estadosDoBrasil[n]);
            };
            System.out.print("\n");
        }else{
            System.out.print("Infelizmente não foi encontrado o estado que vc esta procurando, ele não existe na lista");
            System.out.print("\n\n");
        }
    }
}
