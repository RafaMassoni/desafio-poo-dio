package br.com.dio.desafio.dominio;

import java.util.Objects;

public class BootcampEmpresa extends Bootcamp{

    private final Empresa empresa;

    public BootcampEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BootcampEmpresa that = (BootcampEmpresa) o;
        return Objects.equals(empresa, that.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), empresa);
    }
}
