package model; //PACOTE MODELO DE NEGÓCIOS

// ATRTIBUTOS
public class Personagem {
	public String nome;
	public double altura;
	public int vida;
	
	public String perderVidas(int espinho) {
		String situacao;
		if (vida - espinho > 0) {
		vida = vida - espinho;
		situacao = "vivo";
		}
		else { 
			vida = 0;
			situacao = "morto";
		}
		return "\nPerda de Vidas: \nNome: " + nome +
				"\nTotal Vidas: "+ vida +
				"\nSituação: " + situacao + "\n";
	}
	
	public void ganharVidas(int bonus) {
		vida = vida + bonus;
		
	System.out.println("\n Aumento de vidas:");
	System.out.println("Nome: " + nome + " - Total Vidas: " + vida);
	}
	
	public void detalhes() {
	System.out.println("\n Detalhes do Personagem");
	System.out.println("Nome: " + nome);
	System.out.println("Altura: " + altura);
	System.out.println("Total de vidas " + vida + "\n");
	}
	
 // METODO CONSTRUTOR SIMPLES 
public Personagem() {
	super();
}

//METODO CONSTRUTOR COMPLETO
public Personagem(String nome, double altura, int vida) {
	super();
	this.nome = nome;
	this.altura = altura;
	this.vida = vida;
}


}