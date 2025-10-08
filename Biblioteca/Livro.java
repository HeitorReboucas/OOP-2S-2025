public class Livro extends Material {
    private String autor;

    public Livro(String titulo, Integer ano, String autor){
        super(anoPublicacao, titulo)
        this.autor = autor;
    }

    public String setAutor(String autor){
    return this.autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public void descricao() {
        System.out.println("Edicao:" + this.getAutor());
    }

    }
