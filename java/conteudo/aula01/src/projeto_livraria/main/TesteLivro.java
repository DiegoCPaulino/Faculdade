package projeto_livraria.main;

import projeto_livraria.entities.Livro;

public class TesteLivro {
    public static void main(String[] args) {

        Livro objetoLivro = new Livro();

        objetoLivro.setTitulo("Código Limpo");
        objetoLivro.setEditora("Editora Teste");
        objetoLivro.setQuantidade(50);
        objetoLivro.setValor(39.99);

        System.out.println(
                "• Título: " + objetoLivro.getTitulo() +
                "\n• Editora: " + objetoLivro.getEditora() +
                "\n• Quantidade: " + objetoLivro.getQuantidade() +
                "\n• Valor: " + objetoLivro.getValor()
        );
    }
}
