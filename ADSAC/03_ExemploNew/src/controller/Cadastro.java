package controller;
// CONTROLE DO PROJETO CRIA��O DE OBJETOS DE ACORDO COM A F�BRICA
// () CHAMADA M�TODO CONSTRUTOR DE OBJETOS

import model.Funcionario;
import model.Livro;

import model.Usuario;

public class Cadastro {
              // APENAS PACOTE CONTROLLER
	     public static void main(String[] args) {
		
		
		// IMSTANCIANDO UM OBJETO DA CLASSE USUARIO 
		Usuario joao = new Usuario ();
		joao.nome = "Jo�o Maur�cio Xavier";
		joao.endereco = "Rua Peixoto Souza, 37";
		
		Usuario tiago = new Usuario ();
		tiago.nome = "Thiago Santos";
		tiago.endereco = "Rua Hogwarts 934";
		
		Usuario joana = new Usuario ();
		joana.nome = "Joana Martins";
		joana.endereco = "Rua Margaridas, 88";
		
		 // SYSOUT+ CRTL SPACE 
		System.out.println("RELAT�RIO DO USU�RIO:");
		
		System.out.println("Nome: " + joao.nome);
		System.out.println("Endere�o: " + joao.endereco);
		
		System.out.println("Nome: " + tiago.nome);
		System.out.println("Endere�o: " + tiago.endereco);
		
		System.out.println("Nome: " + joana.nome);
		System.out.println("Endere�o: " + joana.endereco);
	
		Funcionario joao1 = new Funcionario ();
		joao1.nome = "Jo�o Maur�cio Xavier";
		joao1.cpf = "181282345654";
        joao1.matricula = 232467631;
        	
        System.out.println("Funcion�rio Cadastrado:");
        System.out.println("Nome: " + joao1.nome);
        System.out.println("CPF: " + joao1.cpf );
        System.out.println("N�mero de Matr�cula: " + joao1.matricula);
        
        Livro java = new Livro ();
        java.autor = "Fabr�cio castro";
		java.editora = "Rocco";
		java.isbn = "234235";
        java.nome = " Java Para Iniciantes";
       
        System.out.println("Livro Cadastrado:");
        System.out.println("Nome: " + java.nome);
        System.out.println("Autor: " + java.autor );
        System.out.println("ISBN: " + java.isbn);
        System.out.println("Editora: " + java.editora);
        

        
	}

}
