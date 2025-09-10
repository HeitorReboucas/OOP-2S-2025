package sistema_iptu;

public class Chacara extends Imovel{
    private Boolean Tem_PocoArtesiano;

    public Chacara(Municipio Municipio, Double AreaM2, Integer Vagas){
        super(Municipio, AreaM2, Vagas);
        this.Tem_PocoArtesiano = Tem_PocoArtesiano;
    }
    }