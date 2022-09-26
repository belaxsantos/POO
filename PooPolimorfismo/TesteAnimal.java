package POOPolimorfismo;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("\n Exemplos de animais que emitem som e se movimentam de formas únicas:\n");
		
		cachorro.som();
		cachorro.movimento();
		System.out.println();
		cavalo.som();
		cavalo.movimento();
		System.out.println();
		preguica.som();
		preguica.movimento();
				
	}
}
