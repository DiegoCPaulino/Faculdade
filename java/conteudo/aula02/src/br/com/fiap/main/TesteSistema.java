package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {
        Colaborador objColaborador = new Colaborador(
                JOptionPane.showInputDialog("Nome:"),
                Integer.parseInt(JOptionPane.showInputDialog("Idade:")),
                JOptionPane.showInputDialog("Cargo:"),
                Double.parseDouble(JOptionPane.showInputDialog("Valor da hora:")),
                Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas:"))
        );
        Empresa objEmpresa = new Empresa(
                JOptionPane.showInputDialog("Digite o CNPJ:"),
                JOptionPane.showInputDialog("Digite a razão social:")
        );
        Endereco objEndereco = new Endereco(
                JOptionPane.showInputDialog("Logradouro:"),
                Integer.parseInt(JOptionPane.showInputDialog("Número:")),
                JOptionPane.showInputDialog("CEP:"),
                JOptionPane.showInputDialog("Cidade:"),
                JOptionPane.showInputDialog("Bairro:")
        );

        objEmpresa.setEndereco(objEndereco);

        System.out.println(
                objColaborador + "" + objEmpresa
        );
        System.out.println(
                "Informações do Salário:" +
                "\n" + objColaborador.calcularSalario() + "\n\n" +
                objColaborador.informaSalario()
        );
    }
}
