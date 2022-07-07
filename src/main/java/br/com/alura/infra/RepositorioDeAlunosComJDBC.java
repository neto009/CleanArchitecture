package br.com.alura.infra;

import br.com.alura.escola.dominio.Aluno.Aluno;
import br.com.alura.escola.dominio.Aluno.Cpf;
import br.com.alura.escola.dominio.Aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.Aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try{
            String sql = "INSERT INTO ALUNO VALUES(?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getName());
            ps.setString(3, aluno.getEmail());
            ps.execute();

//            sql = "INSERT INTO TELEFONE VALUES(?, ?);";
//            ps = connection.prepareStatement(sql);
//            for(Telefone telefone: aluno.getTelefones()){
//                ps.setString(1, telefone);
//                ps.setString(2, aluno.getEmail());
//                ps.execute();
//            };

        }catch (SQLException e){
            throw new RuntimeException(e);
        };
    }

    @Override
    public Aluno buscaPorCpf(Cpf cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosOsAlunosMatriculados() {
        return null;
    }
}
