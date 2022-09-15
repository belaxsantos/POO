package Heranca;

public class preguica extends Animal {
	
	private String subirArvore;
	
	public preguica(String nome,int idade, String subirArvore) {
	super(nome,idade);
	this.subirArvore = subirArvore;
	
}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome da Preguiça"+getNome()+"\nIdade: "+getIdade()+"\nO que ela faz? "+subirArvore);
	}
	public void roncoPreguicinha() {
		System.out.println("\nzzzzzz");
	}
	public void sobePreguicinha() {
		System.out.println("\nSubindo a árvore pra  dormir");
	}
}

