package CollectionsEmJava.List;

import java.util.ArrayList;
import java.util.Random;

public class ArrrayList_Collections {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();

        ArrayList<Integer> numeros = new ArrayList<Integer>();

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

        imprimindoArrayListString(nomes);

        System.out.println("\n");

    }

    private static void imprimindoArrayListString(ArrayList<String> arrayList) {
        System.out.println("\nImprimindo lista completa abaixo: \n");
        for (int e = 0; e < arrayList.size(); e++) {
            System.out.print(arrayList.get(e) + ", ");
        }
        System.out.print("Fim.");
        System.out.println("\n");
    }

    private static void imprimindoArrayListInteiros(ArrayList<Integer> arrayList) {
        System.out.println("\nImprimindo lista completa de numeros abaixo: \n");
        for (int e = 0; e < arrayList.size(); e++) {
            System.out.print(arrayList.get(e) + " ");
        }
        System.out.println("\n");
    }

    @SuppressWarnings("unused")
    private static void embaralhandoNumeros(ArrayList<Integer> arrayList, int limite) {
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

}
