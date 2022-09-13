package POO;

public class PacienteTeste {

	public static void main(String[] args) {
		//instanciar a classe paciente
		
		Paciente pessoa1 = new Paciente("Ronaldo Souza",22,"Dor de cabeça","Masculino");
		Paciente pessoa2 = new Paciente("Eva Alves",63,"Febre","Femenino");
		
		System.out.println("\n*****Hospital Santa Casa*****");
		pessoa1.imprimirInfo();
		System.out.println("\n");
		pessoa2.imprimirInfo();
		
		
	}

}
