package br.com.estudoJava.entities;

public class Endereco {
    private String logradouto;
    private int numero;
    private String cep;
    private String complemento;

    public void setLogradouto(String logradouto) {
        this.logradouto = logradouto;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouto() {
        return logradouto;
    }
    public int getNumero() {
        return numero;
    }
    public String getCep() {
        return cep;
    }
    public String getComplemento() {
        return complemento;
    }
}