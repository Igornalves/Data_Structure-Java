package AlgoritimosDeEstruturasDeDados;

import java.util.ArrayList;

public class VetorEmJava {
    public static void main(String[] args) {

        String[] vetor = new String[11];

        vetor[0] = "Gabriel";
        vetor[1] = "Sophia";
        vetor[2] = "Arthur";
        vetor[3] = "Maycon";
        vetor[4] = "Luiz";
        vetor[5] = "Nicole";
        vetor[6] = "Izabela";
        vetor[7] = "Fernando";
        vetor[8] = "Igor";
        vetor[9] = "Lucas";
        vetor[10] = "Nicolas";

        System.out.println("");
        
        System.out.println("Lista de Alunos: \n");
        
        for(int r = 0 ; r < vetor.length ; r++){
            System.out.print(r + " " + vetor[r] + "\n");
        }
        
        int[] numerosDoJogo = new int[11];
        
        numerosDoJogo[0] = 40;
        numerosDoJogo[1] = 30;
        numerosDoJogo[2] = 56;
        numerosDoJogo[3] = 3;
        numerosDoJogo[4] = 5;
        numerosDoJogo[5] = 8;
        numerosDoJogo[6] = 95;
        numerosDoJogo[7] = 23;
        numerosDoJogo[8] = 12;
        numerosDoJogo[9] = 10;
        numerosDoJogo[10] = 55;
        
        System.out.println("");

        System.out.println("Lista de Numeros do Jogo Do Bicho: \n");

        for(int w = 0 ; w < numerosDoJogo.length ; w++){
            System.out.print(w + ". " + numerosDoJogo[w] + "\n");
        }

        String[] vetorzao = {"Iasmin","Raissa","Maria","Daniel","Thiago","Juliana","Joao","Vitor","Eduardo","Iarlei"};

        System.out.println("");

        System.out.println("Lista de Funcionario: \n");
        
        for(int t = 0; t < vetorzao.length ; t++){
            System.out.print(t + " " + vetorzao[t] + "\n");
        };
        
        ArrayList<String> vetozinho = new ArrayList<String>();
        
        vetozinho.add("BMW");
        vetozinho.add("Gol");
        vetozinho.add("S10");
        vetozinho.add("Corsa");
        vetozinho.add("Kwid");
        vetozinho.add("Toyota");
        vetozinho.add("Toro");
        vetozinho.add("Ford");
        vetozinho.add("Argo");
        
        System.out.println("");
        
        System.out.println("Lista de carros: \n");

        for(int e = 0 ; e < vetozinho.size() ; e++){
            System.out.print(e + " " + vetozinho.get(e) + "\n");
        }
        
        System.out.println("");

    }
}
