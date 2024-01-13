package Lista_Ligada_Generica.Class;

public class Cliente {

    private int cpf;
    private String nome;

    public Cliente(int novoCpf, String novoNome) {
        this.cpf = novoCpf;
        this.nome = novoNome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return this.nome;
    }

    public Integer toInteger() {
        return this.cpf;
    }
}
