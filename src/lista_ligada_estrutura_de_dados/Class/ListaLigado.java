package lista_ligada_estrutura_de_dados.Class;

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

    public void remover(){

    }

    public Elemento get(int posicao){

        Elemento atual = this.primeiro;

        for(int u =0; u < posicao;u++){
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        
        return atual;
    }
}
