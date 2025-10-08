public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(String nome, String nome, String cargo){
        super(nome, email);
        this.matricula = matricula;
    }
 
    public Integer getCargo(){
        return cargo.cargo;

    }

    public void setCargo(Integer cargo){
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo(){
        System.out.println("nome:" + this.getNome());
        System.out.println("email:" + this.getEmail());
        System.out.println("Matricula:" + this.getCargo());
    }

}