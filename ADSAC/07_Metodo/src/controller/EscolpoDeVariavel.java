package controller;

public class EscolpoDeVariavel {
	
 public static int x = 1; // VÁRIAVEL GLOBAL
 
               public static void main(String[] args) {
		
int x = 5; 
System.out.println("Variável local x no início main " + x);
metodoA(); //CHAMADA PARA RODAR O METODO()A
metodoB();
metodoA();
metodoB();
metodoB(7);
metodoB(x);
int y = 3;
metodoB (y);

double n1, n2;
n1 = 7;
n2 = 6;
calcularMedia(n1, n2);
situacaoAluno(8.4);
String respostaSituacao;
respostaSituacao = situacaoAluno (8.4);
System.out.println("Sua Situação final é " + respostaSituacao);
System.out.println("Sua Situação final é " + situacaoAluno(4.5));
               } //FIM DO MÉTODO MAIN
                           
	public static void metodoA () {
int x = 25;
System.out.println("Variável local x ao entrar no metodoA() é " + x);
x = x + 1;
System.out.println("Variável local x antes de sair do metodoA() é "+ x);
      
	} //FIM DO METODO A()
	
	public static void metodoB () { //PROCURA UMA VARIAVEL GLOBAL
		
System.out.println("Variável global x ao entrar no metodoB() é " + x);
x = x * 10;
System.out.println("Variável global x antes de sair do metodoB() é "+ x);
	     
	} //FIM DO METODO B()
	
	public static void metodoB ( int x) { // x VARIAVEL LOCAL -> ENTRADA DE PARÂMETROS
		
System.out.println("Variável local x ao entrar no metodoB() é " + x);
x = x * 10;
System.out.println("Variável local x antes de sair do metodoB() é "+ x);
			     
	} //FIM DO METODO B()
	
	public static void calcularMedia (double nota1, double nota2) {
		double media ;
		media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		
	}// FIM DO MÉTODO calcularMedia()

	public static String situacaoAluno( double media) {
	  String situacao; 
		if ( media >= 6 ) {
		situacao = "APROVADO";
		} else {
			situacao = "REPROVADO";
		}
		return situacao;
		
		
		
	}//FIM DO SITUACAOALUNO()
}
