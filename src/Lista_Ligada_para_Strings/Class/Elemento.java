package Lista_Ligada_para_Strings.Class;

public class Elemento {

    private String valor;
    private Elemento proximo;

    public Elemento(String novoValor) {
        this.valor = novoValor;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public String getValor() {
        return valor;
    }
}
