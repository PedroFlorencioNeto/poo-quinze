import java.lang.System;

public class abstract Pessoa{
    protected String cpf;
    protected String nome;
    protected int idade;

    public Pessoa(String _cpf, String _nome, int _idade){
        cpf = _cpf;
        nome = _nome;
        idade = _idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniversario() {
        int aniversario = getIdade()+1;
        System.out.println("Parabéns por fazer "+aniversario.toString()+" anos");
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + "]";
    }
}