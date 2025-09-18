package br.com.fiap.entities;

public class Cliente {

    // Visibilidade ,tipos de dados e atributos:
    private String nome;
    private int idade;
    private double altura;
    private Endereco endereco;

    // Metódos seters (entrada de dados)
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setAltura (double altura) {
        this.altura = altura;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Métodos geters (saída de dados)
    public String getNome () {
        return nome;
    }
    public int getIdade () {
        return idade;
    }
    public double getAltura () {
        return altura;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}
