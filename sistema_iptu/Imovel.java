package sistema_iptu;

public class Imovel {
    private Municipio Municipio;
    private Double AreaM2;
    private Integer Vagas;

    public Double CalcularIPTU(){
        return this.AreaM2 * this.Municipio.getPrecoM2();

}

    public Municipio getMunicipio() {
        return this.Municipio;
    }

    public void setMunicipio(Municipio Municipio) {
        this.Municipio = Municipio;
    }

    public double getAreaM2() {
        return this.AreaM2;
    }

    public void setAreaM2(double AreaM2) {
        this.AreaM2 = AreaM2;
    }

    public Integer getVagas() {
        return this.Vagas;
    }

    public void setVagas(Integer Vagas) {
        this.Vagas = Vagas;
    }

}
