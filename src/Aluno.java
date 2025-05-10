public class Aluno extends Pessoa{

    protected String matricula;

    public Aluno(String _cpf, String _nome, int _idade){
        super(_cpf, _nome, _idade);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga!");
    }
}
