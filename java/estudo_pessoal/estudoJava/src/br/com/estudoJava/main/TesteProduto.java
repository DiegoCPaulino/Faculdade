package br.com.estudoJava.main;

import br.com.estudoJava.entities.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto objProduto = new Produto();

        objProduto.setNome("Caneta");
        objProduto.setPreco(2.7);
        objProduto.setQnt(5);

        System.out.println(
            "CONSULTA DE PRODUTOS:" +
            "\n• PRODUTO: " + objProduto.getNome() +
            "\n• VALOR: R$" + objProduto.getPreco() +
            "\n• QUANTIDADE: " + objProduto.getQnt()
        );
    }
}
