package Lista_Ligada_Generica.Class;

public class ListaLigada<TIPO> {
    // lista duplamente encadeada

    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;

    public void ListaLigado() {
        this.tamanho = 0;
    }

    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Elemento<TIPO> getPrimeiro() {
        return this.primeiro;
    }

    public Elemento<TIPO> getUltimo() {
        return this.ultimo;
    }

    public void adicionar(TIPO novoValor) {

        Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        tamanho++;
    }

    public void remover(TIPO valorProcurado) {

        Elemento<TIPO> anterior = null;

        Elemento<TIPO> atual = this.primeiro;

        for (int d = 0; d < this.getTamanho(); d++) {

            if (atual.getValor().equals(valorProcurado)) {

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

    public Elemento<TIPO> get(int posicao) {

        Elemento<TIPO> atual = this.primeiro;

        for (int u = 0; u < posicao; u++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }
}
