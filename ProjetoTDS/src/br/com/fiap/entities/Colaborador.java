package br.com.fiap.entities;

public class Colaborador {
    private String nome;
    private int idade;
    private String cargo;
    private double valorHora;
    private double quantidadeHora;

    public Colaborador() {
    }

    public Colaborador(String nome, int idade, String cargo, double valorHora, double quantidadeHora) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.quantidadeHora = quantidadeHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public void setQuantidadeHora(double quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCargo() {
        return cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public double getQuantidadeHora() {
        return quantidadeHora;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "\nnome='" + nome + '\'' +
                "\nidade=" + idade +
                "\ncargo='" + cargo + '\'' +
                "\nvalor da hora:" + valorHora +
                "\nquantidade de horas:" + quantidadeHora + '}';
    }

    public double calcularSalario(){
        return valorHora * quantidadeHora;
    }

    public String informaSalario(){
        String informacao = null;
        if(calcularSalario() <= 1555) {
            informacao = "O salário está abaixo de R$1.000,00";
        } else {
            informacao = "O salário está acima de R$1.000,00";
        }
        return informacao;
    }
}
