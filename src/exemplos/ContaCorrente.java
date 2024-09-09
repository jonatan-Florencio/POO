package exemplos;
 
public class ContaCorrente extends Conta{
 
    private double limite;
    
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
   public ContaCorrente(String banco, int agencia, int numero, String titular, double saldo, double limite) {
		super(banco, agencia, numero, titular, saldo);
		this.limite = limite;
	}
  
    public ContaCorrente() {
	super();
}

	public boolean sacar(double valor) {
        boolean resultado = false;
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            resultado = true;
        }
        if (this.getSaldo() + this.getLimite() >= valor) {
            this.setSaldo(this.getSaldo() + this.getLimite() - valor);
            resultado = true;
        }
        return resultado;
    }
	@Override
	public String toString() {
		return "Conta Corrente "
				+""
				+"/n" + super.toString()
				+ "/nLimite: " + this.getLimite();
	}
   
    
}
