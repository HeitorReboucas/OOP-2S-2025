public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador("Dell", "Inspiron", 8000, 500000, 4, 1000);
        SistemaOperacional so = new SistemaOperacional("Linux", "Ubuntu 22.04", comp);

        Programa p1 = new Programa("Editor de Texto", 2000, 1000, 1000000);
        Programa p2 = new Programa("Jogo Pesado", 16000, 20000, 50000000);
        Programa p3 = new Programa("Banco de Dados", 1000, 600000, 2000000);

        System.out.println(">>> Tentando executar programas...\n");
        p1.executarPrograma(so);
        p2.executarPrograma(so);
        p3.executarPrograma(so);
    }
}