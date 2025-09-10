package sistema_iptu;

import sistema_iptu.Apartamento;

public class Main {
    public static void main(string[] args) {
        Municipio Brasilia = new Municipio(nome: "Brasilia", Estado: "DF", PrecoM2: 65.5);

        Apartamento apt = new Apartamento(Brasilia, AreaM2: 52.0, Vagas: 1, Tem_Elevador:(true);

        system.out.println(apt.CalcularIPTU());

    }
}
