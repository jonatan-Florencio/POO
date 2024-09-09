package exercicio1;

public class Microondas extends Eletrodomestico {
	
	
	
	private double Capacidadelitros;
	
	
	public Microondas(String modelo, String fabricante, double consumoDia, double capacidadelitros) {
		super(modelo, fabricante, consumoDia);
		Capacidadelitros = capacidadelitros;
	}

	public Microondas() {
		super();
		
	}

	
	public double getCapacidadelitros() {
		return Capacidadelitros;
	}

	public void setCapacidadelitros(double capacidadelitros) {
		Capacidadelitros = capacidadelitros;
	}
	
	
	

}
