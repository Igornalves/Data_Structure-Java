package ComparacaoDeAlgoritimosDeOrdenacao;

public class RetornoDeTrocas {

    private int[] array;
    private int trocas;

    public RetornoDeTrocas(int[] array, int trocas) {
        this.array = array;
        this.trocas = trocas;
    }

    public int[] getArray() {
        return array;
    }

    public int getTrocas() {
        return trocas;
    }
}
