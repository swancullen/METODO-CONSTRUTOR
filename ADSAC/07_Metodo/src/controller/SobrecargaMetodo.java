package controller;

public class SobrecargaMetodo {
   static int idade;
   static String nome;
   
	public static void main(String[] args) {
		cadastrarPessoa(58);
		cadastrarPessoa("Jorge Nogueira");
		cadastrarPessoa(46, "Fabrício");
	}// FIM DO METODO MAIN

	public static void cadastrarPessoa (int valor){
		idade = valor;
		System.out.println("Idade: " + idade);
	} // FIM DO CADRASTRARPESSOA
	public static void cadastrarPessoa (String valor) {
		nome = valor;
		System.out.println("Nome: " + nome);
	} //FIM DO CADASTRARPESSOA
	
	public static void cadastrarPessoa(int valor1, String valor2) {
		idade = valor1;
		nome= valor2;
		System.out.println("Idade: " + idade + " - Nome: " + nome);
		
	} // FIM DO CADASTRARPESSOA
	
	} // FIM DE CLASSE