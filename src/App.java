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
    private String cpf;
    private String nome;
    private int idade;

    public int getCpf() {
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
        idade += 1;
    }
}

public class Disciplina{
    private String codigo;
    private String nome;
    private String semestre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}

