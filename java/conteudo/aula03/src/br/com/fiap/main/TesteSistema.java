package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;

public class TesteSistema {
    public static void main(String[] args) {
        Cliente objCliente = new Cliente();
        Endereco endCliente = new Endereco();

        objCliente.setEndereco(endCliente);

        objCliente.setNome("Diego");
        objCliente.setIdade(21);

        endCliente.setRua("Av. Paulista");
        endCliente.setNumero(1000);

        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Idade: " + objCliente.getIdade());
        System.out.println("Rua: " + objCliente.getEndereco().getRua());
        System.out.println("Número: " + objCliente.getEndereco().getNumero());
    }
}