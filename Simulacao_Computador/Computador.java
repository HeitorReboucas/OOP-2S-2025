public class Computador {
    public String marca;
    public String modelo;
    private int memoriaRAM;
    private int armazenamento;
    private int nucleos;
    private int operacoesPorSegundo;

    public Computador(String marca, String modelo, int memoriaRAM, int armazenamento, int nucleos, int operacoesPorSegundo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getOperacoesPorSegundo() {
        return operacoesPorSegundo;
    }
}