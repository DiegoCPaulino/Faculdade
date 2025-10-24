package projeto_livraria.entities;

import javax.security.sasl.AuthorizeCallback;

public class Livro {
    private String titulo;
    private String editora;
    private int quantidade;
    private double valor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getEditora() {
        return editora;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getValor() {
        return valor;
    }

}
