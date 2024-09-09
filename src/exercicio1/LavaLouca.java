package exercicio1;

public class LavaLouca extends Eletrodomestico{
	
	
	
	private double Capacidadelitros;
	
	
	public LavaLouca(String modelo, String fabricante, double consumoDia, double capacidadelitros) {
		super(modelo, fabricante, consumoDia);
		Capacidadelitros = capacidadelitros;
	}


	public LavaLouca() {
		super();
		
	}

	
	public double getCapacidadelitros() {
		return Capacidadelitros;
	}

	public void setCapacidadelitros(double capacidadelitros) {
		Capacidadelitros = capacidadelitros;
	}
	
	
	

}