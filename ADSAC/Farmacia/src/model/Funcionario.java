package model;

public class Funcionario {
     
	public int matricula;
	public String nome;
	public String dataContratacao;
	
	//METODO CONSTRUTOR SIMPLES
    public Funcionario () {
}
    
  //METODOCONSTRUTOR COMPLETO
    public Funcionario (int matricula,String nome, String dataContratacao) {
	this.matricula = matricula;
	this.nome = nome;
	this.dataContratacao = dataContratacao;

}
}