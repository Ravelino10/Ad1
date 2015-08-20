class Carne extends Tipo{
		
	Carne(String nome, double preco) {
		super(nome, preco);
	}
		
	public static void main (String arg[]) {
		
		Carne carne1, carne2, carne3;
		
		carne1 = new Carne ("Boi", 1.0);
		carne2 = new Carne ("Peixe", 2.0);
		carne3 = new Carne ("Frango", 1.5);
		
	}
	
}
