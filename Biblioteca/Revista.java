public class Revista extends Material {
    private Integer edicao;

    public Revista(String titulo, Integer anoPublicacao, Integer edicao){
        super(anoPublicacao, titulo)
        this.edicao = edicao;
    }

    public 

    public Integer getEdicao() {
        return this.edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }
    


    @Override
    public void descricao() {
        System.out.println("Edicao:" + this.getEdicao());
    }
}
