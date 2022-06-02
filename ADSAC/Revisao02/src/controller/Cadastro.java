package controller; // MÉTODO MAIN 

import model.Personagem;

// GESTÃO DO SEU PROJETO/AÇÕES DO SEU OBJETO

public class Cadastro {

	public static void main(String[] args) {
		// INSTANCIAR OBJETOS DOS PERSONAGENS 
		
		
	//MÉTODO CONSTRUTOR SIMPLES
		Personagem ugo = new Personagem ();
		//INSERINDO VALORES NOS ATRIBUTOS
		ugo.nome = "Ugo Trovão Vermelho";
		ugo.altura = 2.53;
		ugo.vida = 3;
		
		//MÉTODO CONSTRUTOR COMPLETO
		//STRING NOME, DOUBLE ALTURA, INT VIDA
	   Personagem tea = new Personagem ("Tea Tufão Cinzento", 1.97, 2);
	   
	  ugo.ganharVidas(2);
	  tea.ganharVidas(2);
	   
	  String texto = ugo.perderVidas(4);
	  System.out.println(texto);
	  
	  System.out.println(tea.perderVidas(8)); 
	  
	  ugo.detalhes();
	  tea.detalhes();
	}

}
