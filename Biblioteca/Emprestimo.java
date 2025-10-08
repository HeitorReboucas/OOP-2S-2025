public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataE;
    private String dataD;

    public Emprestimo(Pessoa pessoa, Material material, String DateE, String DataD) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataE = dataE;
        this.dataD = dataD;
    }


    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getDataE() {
        return this.dataE;
    }

    public void setDataE(String dataE) {
        this.dataE = dataE;
    }

    public String getDataD() {
        return this.dataD;
    }

    public void setDataD(String dataD) {
        this.dataD = dataD;
    }


     void ExibirDetalhes(){
        System.out.println("Data do Emprestimo:" + this.dataE);
        System.out.println("Data do Emprestimo:" + this.dataD);
        System.out.println("Pessoa Vinculada:");
        this.pessoa.exibirInfo();
        System.out.println("Material Vinculado:");
        this.material.descricao();
    }
}
