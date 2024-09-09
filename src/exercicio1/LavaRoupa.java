package exercicio1;

public class LavaRoupa extends Eletrodomestico {
	
	private double CapacidadeKg;

	
	
	public LavaRoupa(String modelo, String fabricante, double consumoDia, double capacidadeKg) {
		super(modelo, fabricante, consumoDia);
		CapacidadeKg = capacidadeKg;
	}

	public LavaRoupa() {
		super();
	}

	public double getCapacidadeKg() {
		return CapacidadeKg;
	}

	public void setCapacidadeKg(double capacidadeKg) {
		CapacidadeKg = capacidadeKg;
	}
	
	
	

}
