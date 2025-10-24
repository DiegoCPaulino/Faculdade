package br.com.estudoJava.entities;

public class Aluno {
    private String nome;
    private String matricula;
    private Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}