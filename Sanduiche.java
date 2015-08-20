class Sanduiche extends Lanche{

	Sanduiche(Carne Ingrediente1, Queijo Ingrediente2, Salada Ingrediente3, Molho Ingrediente4) {
		super(Ingrediente1, Ingrediente2, Ingrediente3, Ingrediente4);
	}
	
	double getPrecoTotal() {
		return (Ingrediente1.preco + Ingrediente2.preco + Ingrediente3.preco + Ingrediente4.preco) * 1.3;
	}	
	
}
