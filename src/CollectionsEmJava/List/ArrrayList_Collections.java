package CollectionsEmJava.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrrayList_Collections {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        List<Integer> numeros = new ArrayList<Integer>();

        embaralhandoNumeros(numeros, 25);

        imprimindoArrayListInteiros(numeros);

        nomes.add("Gabriel");
        nomes.add("Sophia");
        nomes.add("Arthur");
        nomes.add("Maycon");
        nomes.add("Luiz");
        nomes.add("Nicole");
        nomes.add("Izabela");
        nomes.add("Fernando");
        nomes.add("Igor");
        nomes.add("Lucas");
        nomes.add("Nicolas");

        verificandoElementoString(nomes, "Maycon");

        System.out.println("O elemento chamando "+ nomes.get(9).toString() + " foi removido da lista !!!");

        nomes.remove(9);

        imprimindoArrayListString(nomes);

    }

    private static void imprimindoArrayListString(List<String> arrayList) {
        System.out.println("\nImprimindo lista completa abaixo: \n");
        for (int e = 0; e < arrayList.size(); e++) {
            System.out.print(arrayList.get(e) + ", ");
        }
        System.out.print("Fim.");
        System.out.println("\n");
    }

    private static void imprimindoArrayListInteiros(List<Integer> arrayList) {
        System.out.println("\nImprimindo lista completa de numeros abaixo: \n");
        for (int e = 0; e < arrayList.size(); e++) {
            System.out.print(arrayList.get(e) + " ");
        }
        System.out.println("\n");
    }

    @SuppressWarnings("unused")
    private static void embaralhandoNumeros(List<Integer> arrayList, int limite) {
        Random random = new Random();
        int tamanhoArray = arrayList.size();
        
        while (arrayList.size() < limite) {
            int numerosAleatorios = random.nextInt(limite);
            if (!arrayList.contains(numerosAleatorios)) {
                arrayList.add(numerosAleatorios);
                tamanhoArray++;
            }
        }

    }

    private static void verificandoElementoString(List<String> lista, String elemento) {
        // elemento.equalsIgnoreCase(elemento);
        boolean validacao = lista.contains(elemento);

        if (validacao == true) {
            System.out.print("\nelemento verificado tem na fila !!! elemento: ");
            System.out.println(elemento);
        } else {
            System.out.println("\nelemento verificado nao existe na fila");
        }
        System.out.print("\n");
    }


}
