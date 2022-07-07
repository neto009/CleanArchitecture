package br.com.alura.escola.dominio.Aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular (Aluno aluno);

    Aluno buscaPorCpf(Cpf cpf);

    List<Aluno> listarTodosOsAlunosMatriculados();
}
