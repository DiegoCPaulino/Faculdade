package br.com.estudoJava.entities;

public class Produto {
    private String nome;
    private double preco;
    private int qnt;

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQnt() {
        return qnt;
    }
}
