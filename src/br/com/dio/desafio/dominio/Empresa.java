package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Empresa {
    private final String nome;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nome, empresa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
