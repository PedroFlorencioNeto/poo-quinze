import java.lang.System;

public class App{
    public static void main(String[] args) {
        Disciplina programacao_orientada_objetos = new Disciplina();
        Disciplina raciocinio_logico = new Disciplina();
        Disciplina fundamentos_computacao = new Disciplina();
        final Pessoa fazAniversarioPessoa = new Pessoa();
        fazAniversarioPessoa.fazerAniversario();
        System.out.println(fazAniversarioPessoa.getIdade());
        
        final Turma turma = new Turma();
        
        
        turma.adicionarAluno("L Gabriel");
        turma.adicionarAluno("Teste");
        

    }
}

