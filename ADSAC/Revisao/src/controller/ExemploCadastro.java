package controller;

import model.Personagem;
import model.Residencia;

public class ExemploCadastro {

	public static void main(String[] args) {
		//INSTANCIAR OBJETOS
		Residencia obj1 = new Residencia();
		obj1.tipo = "Casa";
		obj1.cor = "branca";
		
		Residencia obj2 = new Residencia();
		obj2.tipo = "Apartamento";
		obj2.cor = "Amarelo";
		
		Residencia obj3 = new Residencia();
		obj3.tipo = "Kitnet";
		obj3.cor = "Azul";
		
		System.out.println("Residencia:\n");
		
		
		System.out.println("Tipo: " + obj1.tipo);
		System.out.println("Tipo: " + obj1.cor);
		
		System.out.println("Tipo: " + obj2.tipo);
		System.out.println("Tipo: "+ obj2.cor);
		
		System.out.println("Tipo: " + obj3.tipo);
		System.out.println("Tipo: "+ obj3.cor);
		
		
		System.out.println("\n\nPersonagens\n\n");
		
		
		Personagem p1 = new Personagem();
		p1.nome = "Marcelo";
		p1.altura = 1.82; //SEM ASPAS PORQUE É DOUBLE
		p1.idade = 32;
		
		Personagem p2 = new Personagem();
		p2.nome = "Carla";
		p2.altura = 1.65;
		p2.idade =27;
		
		Personagem p3 = new Personagem();
		p3.nome = "Jabira";
		p3.altura = 1.55;
		p3.idade = 23;
		
		System.out.println("Nome: + p1.nome");
		System.out.println("Altura: + p1.altura");
		System.out.println("Idade: + p1.idade");
		
		System.out.println("Nome: + p2.nome");
		System.out.println("Altura: + p2.altura");
		System.out.println("Idade: + p2.idade");
		
		System.out.println("Nome: + p3.nome");
		System.out.println("Altura: + p3.altura");
		System.out.println("Idade: + p3.idade");
	}
}
