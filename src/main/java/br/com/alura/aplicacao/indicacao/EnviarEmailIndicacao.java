package br.com.alura.aplicacao.indicacao;

import br.com.alura.escola.dominio.Aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
