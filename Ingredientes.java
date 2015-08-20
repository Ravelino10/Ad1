abstract class Ingredientes {

	static double preco;

	Ingredientes(double preco) {
		this.preco = preco;
	}
	
	void setPrecoUnitario (double valor) {
		this.preco = valor;
	}
	
	double getValorUnitario () {
		return this.preco;
	}	
	
}
