package model;

public class Personagem {

public String nome;
public int idade;
public String armadura;
public double altura;
 
//METODO CONSTRUTOR SIMPLES
    public Personagem () {
	
}

 //METODOCONSTRUTOR COMPLETO
    public Personagem (String nome , int idade, String armadura, double altura) {
	this.nome = nome;
	this.idade = idade;
	this.armadura = armadura;
	this.altura = altura;
}
    
    
    //METODOCONSTRUTOR PERSONALIZADO
    public Personagem (String nome , String armadura, double altura) {
	this.nome = nome;
	this.idade = 0;
	this.armadura = armadura;
	this.altura = altura;

}	
}

	

