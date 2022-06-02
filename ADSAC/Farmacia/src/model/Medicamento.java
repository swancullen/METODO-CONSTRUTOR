package model;

public class Medicamento {
	public int codigo;
	public String fabricante;
	public String nomenclatura;
	public String formula;
	

	//METODO CONSTRUTOR SIMPLES
    public Medicamento () {
}
    
    
  //METODOCONSTRUTOR COMPLETO
    public Medicamento (int codigo,String fabricante, String nomenclatura, String formula) {
	this.codigo = codigo;
	this.fabricante = fabricante;
	this.nomenclatura = nomenclatura;
	this.formula = formula;
}
}
