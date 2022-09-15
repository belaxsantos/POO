package Heranca;

public class Cavalo extends Animal {
		
	private String deveCorrer;
	
	public Cavalo (String nome,int idade,String deveCorrer) {
		super(nome,idade);
		
		this.deveCorrer = deveCorrer;
		
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	public void imprimirInfo() {
		System.out.println("\nNome do Cavalo: "+getNome()+"\nIdade: "+getIdade()+"Cavalo da roça?"+deveCorrer);
		
	}
	public void relinchoCavalo() {
		System.out.println("\nIRRIR");
		
	}
	public void correCavalinho() {
		System.out.println("\nCorrendo com Ze vaqueiro"); 
	}
	
	
	}
