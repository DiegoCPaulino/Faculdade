package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

import java.sql.SQLOutput;

public class TesteSistema {

    public static void main (String[] args) {

        // Instanciar objetos:
        Cliente objetoCliente = new Cliente();

        // Entradas:
        objetoCliente.setNome("Teste");
        objetoCliente.setIdade(50);
        objetoCliente.setAltura(1.55);

        // Saídas:
        /*
        System.out.println("• Nome: " + objetoCliente.getNome());
        System.out.println("• Idade: " + objetoCliente.getIdade());
        System.out.println("• Altura: " + objetoCliente.getAltura());
        */
        System.out.println(
          "• Nome: " + objetoCliente.getNome() +
          "\n• Idade: " + objetoCliente.getIdade() +
          "\n• Altura: " + objetoCliente.getAltura()
        );
    }
}
