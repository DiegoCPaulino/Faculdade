package br.com.fiap.entities;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa() {
    }

    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "\n\nEmpresa{" +
                "\ncnpj='" + cnpj + '\'' +
                "\nrazaoSocial='" + razaoSocial + '\'' +
                endereco + '}';
    }
}
