package Vetores_Arrays;

import java.util.Scanner;

public class BuscaLinearComVetorBidireecionalUsandoString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] listaDeCompras = new String[6][6];

        listaDeCompras[0][0] = "Açúcar";
        listaDeCompras[0][1] = "Arroz";
        listaDeCompras[0][2] = "Feijão";
        listaDeCompras[0][3] = "Óleo";
        listaDeCompras[0][4] = "Macarrão";
        listaDeCompras[0][5] = "Farinha de Trigo";

        listaDeCompras[1][0] = "Biscoito";
        listaDeCompras[1][1] = "Pães";
        listaDeCompras[1][2] = "Frios";
        listaDeCompras[1][3] = "Manteiga";
        listaDeCompras[1][4] = "Café";
        listaDeCompras[1][5] = "Iogurtes";

        listaDeCompras[2][0] = "Leite";
        listaDeCompras[2][1] = "Detergente";
        listaDeCompras[2][2] = "Sabão Liquido";
        listaDeCompras[2][3] = "Amaciante";
        listaDeCompras[2][4] = "Água Sanitaria";
        listaDeCompras[2][5] = "Álcool";

        listaDeCompras[3][0] = "Sacos de Lixo";
        listaDeCompras[3][1] = "Papel toalha";
        listaDeCompras[3][2] = "Shampoo";
        listaDeCompras[3][3] = "Sabonete";
        listaDeCompras[3][4] = "Papel higienico";
        listaDeCompras[3][5] = "Pasta de dente";

        listaDeCompras[4][0] = "Desodorante";
        listaDeCompras[4][1] = "Ovos";
        listaDeCompras[4][2] = "Verduras";
        listaDeCompras[4][3] = "Batatas";
        listaDeCompras[4][4] = "Cenoura";
        listaDeCompras[4][5] = "Tomate";

        listaDeCompras[5][0] = "Frutas";
        listaDeCompras[5][1] = "Carne";
        listaDeCompras[5][2] = "Frango";
        listaDeCompras[5][3] = "Sal";
        listaDeCompras[5][4] = "Fósforo";
        listaDeCompras[5][5] = "Papel Filme";

        System.out.print("Digite o Nome de algum produto de Supermercado que vc compra no mês: ");
        String itemDeSupermercado = input.nextLine();

        //System.out.println("\n");

        //busca linear 

        boolean buscaDoItem = false;

        for(int g = 0 ; g < listaDeCompras.length ; g++){

            for(int d = 0 ; d < listaDeCompras[g].length ; d++){

                String elemento = listaDeCompras[g][d];

                if (elemento.equalsIgnoreCase(itemDeSupermercado)) {
                    buscaDoItem = true;
                    break;
                }
            }
        }

        if (buscaDoItem == true) {
            
            System.out.print("\n\n\n");
            System.out.print("O item !!! " + itemDeSupermercado + " que vc estar procurando tem em nossa lista de supermercado");
            System.out.print("\n\n\n");
            System.out.print("Veja a Lista completa: ");
            System.out.print("\n");
            
            for(int n = 0 ; n < listaDeCompras.length ; n++){
                System.out.print("\n");
                for(int t = 0; t < listaDeCompras[n].length ; t++){
                    System.out.println(t + ". " + listaDeCompras[n][t]);
                }
            }

            System.out.print("\n\n");

        }else{
            System.out.print("\n\n");
            System.out.println("Infelizmente não temos este produto aqui em nossa lista !!!");
            System.out.print("\n\n");
        }
    }
}
