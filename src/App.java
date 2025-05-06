/*

Trabalho de Programação Orientada a Objetos

Unifor - 2025.1

Autores:

- Pedro Florencio de Almeida Neto - 2513700
-
-
-
-
-

*/

// Questão 01: Classes e Objetos

public class Pessoa{
    private int cpf;
    private String nome;
    private int idade;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
}

public class Disciplina{
    private int codigo;
    private String nome;
    private String semestre;
}

