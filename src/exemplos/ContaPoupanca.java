package exemplos;
 
 
 
public class ContaPoupanca extends Conta{	
	
	
	
	
	
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(String banco, int agencia, int numero, String titular, double saldo) {
		super(banco, agencia, numero, titular, saldo);
		// TODO Auto-generated constructor stub
	}

	public boolean sacar(double valor) {
		boolean retorno = false;
		if(this.getSaldo()>=valor) {
			this.setSaldo(this.getSaldo() - valor);
			retorno = true;
		}
		return retorno;
	}
		
}
