package br.com.estudoJava.main;

import br.com.estudoJava.entities.Aluno;
import br.com.estudoJava.entities.Endereco;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        Endereco enderecoAluno = new Endereco();

        objAluno.setEndereco(enderecoAluno);

        objAluno.setNome("Diego");
        objAluno.setMatricula("RM566841");

        enderecoAluno.setLogradouto("Rua Rosario Inserra");
        enderecoAluno.setNumero(120);
        enderecoAluno.setCep("067.630.30");
        enderecoAluno.setComplemento("Apto 51-D");

        System.out.println(
                "CONSULTA DE ALUNOS:" +
                "\n• Nome do aluno(a): " + objAluno.getNome() +
                "\n• Número de matrícula: " + objAluno.getMatricula() +
                "\n\nENDEREÇO:" +
                "\n• Logradouro: " + objAluno.getEndereco().getLogradouto() +
                "\n• Número: " + objAluno.getEndereco().getNumero() +
                "\n• Complemento: " + objAluno.getEndereco().getComplemento() +
                "\n• CEP: " + objAluno.getEndereco().getCep()
        );
    }
}