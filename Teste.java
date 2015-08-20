class Teste {
	
	public static void main (String[] args) {
		
		Sanduiche CheeseBurger;
		Pizza Frango;
		Carne carne1, carne2, carne3;
		Queijo queijo1, queijo2, queijo3;
		Salada salada1, salada2, salada3;
		Molho molho1, molho2, molho3;
		
		carne1 = new Carne ("Boi", 1.0);
		carne2 = new Carne ("Peixe", 2.0);
		carne3 = new Carne ("Frango", 1.5);
		
		queijo1 = new Queijo ("Cheddar", 1.0);
		queijo2 = new Queijo ("Mozzarella", 0.5);
		queijo3 = new Queijo ("Prato", 0.5);
		
		salada1 = new Salada ("Alface", 0.5);
		salada2 = new Salada ("Azeitona", 0.75);
		salada3 = new Salada ("Pimentão", 0.75);
		
		molho1 = new Molho ("Barbecue", 0.9);
		molho2 = new Molho ("Caesar", 1.0);
		molho3 = new Molho ("Tomate", 0.5);
		
		CheeseBurger = new Sanduiche(carne1, queijo3, salada1, molho1);
		System.out.println("O seu Sanduiche custa: " + CheeseBurger.getPrecoTotal() + "\n");
		Frango = new Pizza(carne3, queijo2, salada2, molho2);
		System.out.println("A sua Pizza custa: " + Frango.getPrecoTotal());
	}
	
}
