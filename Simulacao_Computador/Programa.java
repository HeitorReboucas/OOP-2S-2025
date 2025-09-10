public class Programa {
    private String nome;
    private int memoriaRAMAlocada;
    private int SSDOcupado;
    private int qtdOperacoes;

    public Programa(String nome, int memoriaRAMAlocada, int SSDOcupado, int qtdOperacoes) {
        this.nome = nome;
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.qtdOperacoes = qtdOperacoes;
    }

    public void executarPrograma(SistemaOperacional so) {
        Computador comp = so.getComputador();

        if (this.SSDOcupado > comp.getArmazenamento()) {
            System.out.println("Erro: não há espaço suficiente no disco para instalar o programa " + nome + ".");
            return;
        }

        if (this.memoriaRAMAlocada > comp.getMemoriaRAM()) {
            System.out.println("Erro: não há memória RAM suficiente para executar o programa " + nome + ".");
            return;
        }

        double tempoExecucao = (double) qtdOperacoes / (comp.getOperacoesPorSegundo() * comp.getNucleos());
        System.out.println("Programa " + nome + " executado com sucesso!");
        System.out.printf("Tempo de execução: %.2f segundos%n", tempoExecucao);
    }

    public String getNome() {
        return nome;
    }

    public int getMemoriaRAMAlocada() {
        return memoriaRAMAlocada;
    }

    public int getSSDOcupado() {
        return SSDOcupado;
    }

    public int getQtdOperacoes() {
        return qtdOperacoes;
    }
}