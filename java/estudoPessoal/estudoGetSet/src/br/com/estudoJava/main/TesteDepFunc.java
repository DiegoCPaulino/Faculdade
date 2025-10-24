package br.com.estudoJava.main;

import br.com.estudoJava.entities.Departamento;
import br.com.estudoJava.entities.Funcionario;

public class TesteDepFunc {
    public static void main(String[] args) {
        Departamento objDepartamento = new Departamento();
        Funcionario objFuncionario = new Funcionario();

        objFuncionario.setDepartamento(objDepartamento);

        objFuncionario.setNome("Diego");
        objFuncionario.setSalario(3200);

        objDepartamento.setNome("Desenvolvimento");
        objDepartamento.setCodigo(566841);

        System.out.println(
                "CONSULTA DE FUNCIONÁRIOS:" +
                "\n• Nome: " + objFuncionario.getNome() +
                "\n• Salário: " + objFuncionario.getSalario() +
                "\n• Departamento: " + objFuncionario.getDepartamento().getNome() +
                "\n• Código do departamento: " + objFuncionario.getDepartamento().getCodigo()
        );
    }
}
