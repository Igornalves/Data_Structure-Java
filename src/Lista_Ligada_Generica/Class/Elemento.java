package Lista_Ligada_Generica.Class;

public class Elemento<TIPO> {

    private TIPO valor;
    private Elemento<TIPO> proximo;

    public Elemento(TIPO novoValor) {
        this.valor = novoValor;
    }

    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Elemento<TIPO> getProximo() {
        return proximo;
    }

    public TIPO getValor() {
        return valor;
    }
}

