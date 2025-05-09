import java.lang.System;

public class Pessoa{
    protected String cpf;
    protected String nome;
    protected int idade;

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
        if (idade == 33) {
           idade -= 21; 
        }
        idade += 33;
        this.setIdade(idade);
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + "]";
    }
}