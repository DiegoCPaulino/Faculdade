package br.com.fiap.entities;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

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
}
