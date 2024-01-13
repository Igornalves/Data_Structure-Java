package Lista_Ligada_Generica.App;

import Lista_Ligada_Generica.Class.Cliente;
import Lista_Ligada_Generica.Class.ListaLigada;

public class Run {
    public static void main(String[] args) {

        ListaLigada<Integer> numeros = new ListaLigada<Integer>();

        ListaLigada<String> Alunos = new ListaLigada<String>();

        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();


        Alunos.adicionar("Araujo");
        Alunos.adicionar("Wanderson");
        Alunos.adicionar("Carlos");
        Alunos.adicionar("Fernanda");
        Alunos.adicionar("Junior");
        Alunos.adicionar("Luisa");
        Alunos.adicionar("Kawa");
        Alunos.adicionar("Danilo");
        Alunos.adicionar("Nadson");
        Alunos.adicionar("Karine");

        System.out.println("foi Adcionados novos alunos na turma: \n");

        for(int y = 0; y < Alunos.getTamanho(); y++){
            System.out.println(y + ". " + Alunos.get(y).getValor());
        }


        System.out.print("\n");
        
        System.out.println("Foi adcionando novos numeros no Sorteio da semana: \n");
        
        numeros.adicionar(23);
        numeros.adicionar(3);
        numeros.adicionar(45);
        numeros.adicionar(56);
        numeros.adicionar(21);
        numeros.adicionar(23);
        numeros.adicionar(7);
        numeros.adicionar(66);
        numeros.adicionar(87);
        numeros.adicionar(90);
        numeros.adicionar(95);
        
        for(int u = 0; u < numeros.getTamanho(); u ++){
            System.out.print(numeros.get(u).getValor()+" ");
        }

        System.out.print("\n\n");
        
        clientes.adicionar(new Cliente(54126634, "Jose"));
        clientes.adicionar(new Cliente(31233467, "marina"));
        clientes.adicionar(new Cliente(34236673, "fabio"));
        clientes.adicionar(new Cliente(23466423, "Ivone"));
        clientes.adicionar(new Cliente(67456294, "Juana"));
        clientes.adicionar(new Cliente(93414348,"Karen"));
        
        System.out.println("Formam adcionandos novos Cliente em nossa empresa: \n");
        
        for(int i= 0; i < clientes.getTamanho(); i++){
            System.out.println(i + ". " + clientes.get(i).getValor().toString() + "      CPF:." + clientes.get(i).getValor().toInteger());
        }
        
        System.out.print("\n\n");
    }
}
