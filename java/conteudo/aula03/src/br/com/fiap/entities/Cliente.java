package br.com.fiap.entities;

public class Cliente {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}
