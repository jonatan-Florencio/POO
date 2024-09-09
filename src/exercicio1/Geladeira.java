package exercicio1;

public class Geladeira extends Eletrodomestico{
	
	
	
	private double capacidadelitros;
	

	public Geladeira(String modelo, String fabricante, double consumoDia, double capacidadelitros) {
		super(modelo, fabricante, consumoDia);
		this.capacidadelitros = capacidadelitros;
	}


	public Geladeira() {
		super();
		
	}

	
	public double getCapacidadelitros() {
		return capacidadelitros;
	}

	public void setCapacidadelitros(double capacidadelitros) {
		this.capacidadelitros = capacidadelitros;
	}
	
	
	

}
