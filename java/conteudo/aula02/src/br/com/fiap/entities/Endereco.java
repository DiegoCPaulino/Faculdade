package br.com.fiap.entities;

public class Endereco {
    private String logradouro;
    private int numero;
    private String cep;
    private String cidade;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, int numero, String cep, String cidade, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public String getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "\n\nEndereco{" +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero=" + numero +
                "\ncep='" + cep + '\'' +
                "\ncidade='" + cidade + '\'' +
                "\nbairro='" + bairro + '\'' + '}';
    }
}
