package exercicio1;

public class FornoEletrico extends Eletrodomestico{
	
	private double capacidadeLitros;

	
	
	public FornoEletrico(String modelo, String fabricante, double consumoDia, double capacidadeLitros) {
		super(modelo, fabricante, consumoDia);
		this.capacidadeLitros = capacidadeLitros;
	}
	
	public FornoEletrico() {
		super();

	}



	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}

	public void setCapacidadeLitros(double capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
	
	@Override
	public double calcularConsumo (int dias) {
		return (this.getConsumoDia() * dias )* 1.25;
	}
	@Override
	public double calcularConsumo () {
		return (this.getConsumoDia() * 30) * 1.25;
	}
	
}
