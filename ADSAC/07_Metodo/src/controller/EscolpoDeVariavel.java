package controller;

public class EscolpoDeVariavel {
	
 public static int x = 1; // V�RIAVEL GLOBAL
 
               public static void main(String[] args) {
		
int x = 5; 
System.out.println("Vari�vel local x no in�cio main " + x);
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
System.out.println("Sua Situa��o final � " + respostaSituacao);
System.out.println("Sua Situa��o final � " + situacaoAluno(4.5));
               } //FIM DO M�TODO MAIN
                           
	public static void metodoA () {
int x = 25;
System.out.println("Vari�vel local x ao entrar no metodoA() � " + x);
x = x + 1;
System.out.println("Vari�vel local x antes de sair do metodoA() � "+ x);
      
	} //FIM DO METODO A()
	
	public static void metodoB () { //PROCURA UMA VARIAVEL GLOBAL
		
System.out.println("Vari�vel global x ao entrar no metodoB() � " + x);
x = x * 10;
System.out.println("Vari�vel global x antes de sair do metodoB() � "+ x);
	     
	} //FIM DO METODO B()
	
	public static void metodoB ( int x) { // x VARIAVEL LOCAL -> ENTRADA DE PAR�METROS
		
System.out.println("Vari�vel local x ao entrar no metodoB() � " + x);
x = x * 10;
System.out.println("Vari�vel local x antes de sair do metodoB() � "+ x);
			     
	} //FIM DO METODO B()
	
	public static void calcularMedia (double nota1, double nota2) {
		double media ;
		media = (nota1 + nota2) / 2;
		System.out.println("M�dia: " + media);
		
	}// FIM DO M�TODO calcularMedia()

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
