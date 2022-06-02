package controller;

import model.Funcionario;
import model.Medicamento;

public class Cadastro {

	public static void main(String[] args) {
Funcionario ana = new Funcionario();{
		ana.matricula = 202142901;
		ana.nome = "Ana Carolina Alves";
		ana.dataContratacao = "20 de Julho de 2022";
		
Funcionario carol = new Funcionario(202142901,"Ana Carolina Alves","20 de Julho de 2022");
}

Medicamento rinite = new Medicamento();{
rinite.codigo = 345678903;
rinite.fabricante = "GSK";
rinite.nomenclatura = "Dicloridrato de Cetirizina";
rinite.formula= "Solução de sorbitol, glicerol, propilenoglicol";


Medicamento rini = new Medicamento(345678903,"GSK","Dicloridrato de Cetirizina","Solução de sorbitol, glicerol, propilenoglicol");
}

}
}
