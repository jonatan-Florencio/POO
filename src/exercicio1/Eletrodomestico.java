package exercicio1;

public class Eletrodomestico {
	
	private String modelo;
	private String fabricante;
	private double consumoDia;
	
	
	


	public Eletrodomestico(String modelo, String fabricante, double consumoDia) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.consumoDia = consumoDia;
	}


	public Eletrodomestico() {
		super();
		
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	public double getConsumoDia() {
		return consumoDia;
	}

	public void setConsumoDia(double consumoDia) {
		this.consumoDia = consumoDia;
	}

	public double calcularConsumo (int dias) {
		return this.getConsumoDia() * dias;
	}
	
	public double calcularConsumo () {
		return this.getConsumoDia() * 30;
	}
}
