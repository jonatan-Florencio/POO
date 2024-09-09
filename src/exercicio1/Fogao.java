package exercicio1;

public class Fogao extends Eletrodomestico {

	private int QtdBocas;


	
	public Fogao(String modelo, String fabricante, double consumoDia, int qtdBocas) {
		super(modelo, fabricante, consumoDia);
		QtdBocas = qtdBocas;
	}
	public Fogao() {
		super();
	}


	public int getQtdBocas() {
		return QtdBocas;
	}

	public void setQtdBocas(int qtdBocas) {
		QtdBocas = qtdBocas;
	}
	
	
	
	
}
