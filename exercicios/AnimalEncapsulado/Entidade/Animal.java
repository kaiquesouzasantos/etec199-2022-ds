package AnimalEncapsulado.Entidade;

public class Animal {
	private String especie, nome;
	private int quantPatas;
	private double peso;
	
	public Animal() {}
	public Animal(String especie, String nome, int quantPatas, double peso) {
		this.especie = especie;
		this.nome = nome;
		this.quantPatas = quantPatas;
		this.peso = peso;
	}
	
	// SET's
	public void setEspecie(String especie) {this.especie = especie;}
	public void setNome(String nome){this.nome = nome;}
	public void setQuantPatas(int quantPatas) {this.quantPatas = quantPatas;}
	public void setPeso(double peso) {this.peso = peso;}
	
	// GET's
	public String getEspecie() {return this.especie;}
	public String getNome() {return this.nome;}
	public int getQuantPatas() {return this.quantPatas;}
	public double getPeso() {return this.peso;}

	@Override
	public String toString() {
		return  "NOME: "+this.nome+
				"\nESPECIE: "+this.especie+
				"\nQUANTIDADE DE PATAS: "+this.quantPatas+
				"\nPESO: "+this.peso+"KG";
	}
}
