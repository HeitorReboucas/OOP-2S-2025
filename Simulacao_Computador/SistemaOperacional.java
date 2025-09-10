public class SistemaOperacional {
    private String nome;
    private String versao;
    private Computador computador;

    public SistemaOperacional(String nome, String versao, Computador computador) {
        this.nome = nome;
        this.versao = versao;
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public String getNome() {
        return nome;
    }

    public String getVersao() {
        return versao;
    }
}