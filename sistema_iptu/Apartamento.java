package sistema_iptu;

public class Apartamento extends Imovel{   
    private Boolean Tem_Elevador;
    public Apartamento(Municipio Municipio, Double AreaM2, Integer Vagas){
    super(Municipio, AreaM2, Vagas);
    this.Tem_Elevador = Tem_Elevador;
    }
    }
    