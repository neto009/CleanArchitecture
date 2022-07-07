package br.com.alura.escola.dominio.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Cpf cpf;
    private String name;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefones(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }

    public Aluno(Cpf cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
