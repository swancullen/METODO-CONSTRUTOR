package controller;
import model.Cenario;
import model.Personagem;

public class Cadastro {
	public static void main(String[] args) {
	// INSTANCIAR OBJETOS = CRIAR OBJETOS 
		
        Personagem uga = new Personagem();
		uga.nome = "Uga Sauro";
		uga.idade = 238;
		uga.armadura = "Lockdown";
		uga.altura = 1.50;
         
	    Personagem alo = new Personagem("Alo Sauro", 174, "Biquíne de metal", 1.74);
	    Personagem ira = new Personagem("Ira Sauro", "Camisa de Fogo", 1.30);

	    
	    Cenario jogo = new Cenario("Chuva", 8.5, "Caating");
	    Cenario neve = new Cenario("Neve", 24.0, "Praia");
	}
}