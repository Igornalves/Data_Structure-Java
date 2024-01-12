package Lista_Ligada_para_Strings.Class;

public class ListaLigado {

    // lista duplamente encadeada

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigado() {
        this.tamanho = 0;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void adicionar(String novoValor) {

        Elemento novoElemento = new Elemento(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        tamanho++;
    }

    public void remover(String valorProcurado) {

        Elemento anterior = null;

        Elemento atual = this.primeiro;

        for (int d = 0; d < this.getTamanho(); d++) {

            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {

                if (atual == primeiro && atual == ultimo) {

                    this.primeiro = null;
                    this.ultimo = null;

                } else if (atual == primeiro) {

                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);

                } else if (atual == ultimo) {

                    this.ultimo = anterior;
                    anterior.setProximo(null);

                } else {

                    anterior.setProximo(atual.getProximo());
                    atual = null;

                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();

        }

    }

    public Elemento get(int posicao) {

        Elemento atual = this.primeiro;

        for (int u = 0; u < posicao; u++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }
}
