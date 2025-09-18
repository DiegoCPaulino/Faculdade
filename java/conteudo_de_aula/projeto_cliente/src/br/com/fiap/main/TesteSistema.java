package br.com.fiap.main;
import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

import java.sql.SQLOutput;

public class TesteSistema {

    public static void main (String[] args) {

        // Instanciar objetos:
        Cliente objetoCliente = new Cliente();
        Endereco objetoEndCliente = new Endereco();
        Empresa objetoEmpresa = new Empresa();
        Endereco objetoEndEmpresa = new Endereco();

        objetoCliente.setEndereco(objetoEndCliente);
        objetoEmpresa.setEndereco(objetoEndEmpresa);

        // Entradas:
        objetoCliente.setNome("Teste");
        objetoCliente.setIdade(50);
        objetoCliente.setAltura(1.55);

        objetoEndCliente.setLogradouro("Rua Rosário Inserra");
        objetoEndCliente.setNumero(120);
        objetoEndCliente.setComplemento("Apto 51-D");
        objetoEndCliente.setBairro("Chacara Agrindus");
        objetoEndCliente.setCidade("Taboão da Serra");
        objetoEndCliente.setCep("06763030");

        objetoEmpresa.setCnpj("01.010.101/0001-01");
        objetoEmpresa.setRazaoSocial("Teste");

        objetoEndEmpresa.setLogradouro("EndereçoEmpresa");
        objetoEndEmpresa.setNumero(666);
        objetoEndEmpresa.setComplemento("ComplementoEmpresa");
        objetoEndEmpresa.setBairro("BairroEmpresa");
        objetoEndEmpresa.setCidade("CidadeEmpresa");
        objetoEndEmpresa.setCep("00000000");

        // Saídas:
        System.out.println(
          "• Nome: " + objetoCliente.getNome() +
          "\n• Idade: " + objetoCliente.getIdade() +
          "\n• Altura: " + objetoCliente.getAltura() +
          "\n\n• Logradouro: " + objetoCliente.getEndereco().getLogradouro() +
          "\n• Número: " + objetoCliente.getEndereco().getNumero() +
          "\n• Complemento: " + objetoCliente.getEndereco().getComplemento() +
          "\n• Bairro: " + objetoCliente.getEndereco().getBairro() +
          "\n• Cidade: " + objetoCliente.getEndereco().getCidade() +
          "\n• CEP: " + objetoCliente.getEndereco().getCep() +
          "\n\n• CNPJ da Empresa: " + objetoEmpresa.getCnpj() +
          "\n• Razão Social da Empresa: " + objetoEmpresa.getRazaoSocial() +
          "\n\n• Logradouro da Empresa: " + objetoEmpresa.getEndereco().getLogradouro() +
          "\n• Número da Empresa: " + objetoEmpresa.getEndereco().getNumero() +
          "\n• Complemento da Empresa: " + objetoEmpresa.getEndereco().getComplemento() +
          "\n• Bairro da Empresa: " + objetoEmpresa.getEndereco().getBairro() +
          "\n• Cidade da Empresa: " + objetoEmpresa.getEndereco().getCidade() +
          "\n• CEP da Empresa: " + objetoEmpresa.getEndereco().getCep()
        );
    }
}