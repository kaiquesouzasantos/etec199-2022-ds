package Conta;

public class ContaCorrente {
	public double saldoConta, creditoConta;
	public int agenciaConta;
	public String titularConta;
	
	public void taxarConta() {
		this.saldoConta -= 42.72;
	}
	
	public void consultarConta() {
		System.out.print("\nSALDO: R$"+this.saldoConta+"\nCREDITO: R$"+this.creditoConta);
	}
}