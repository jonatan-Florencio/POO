package exercicio1;

public class Cozinha {

	public static void main(String[] args) {
		
		Geladeira g1 = new Geladeira("cinza?kkkkkkk", "Panasonic", 10, 5);
		Geladeira g2 = new Geladeira("branca", "Eletrolux", 20, 5);
		
		Fogao f1 = new Fogao ("fogaotopkkkkk", "phillips", 100, 4);
		
		LavaLouca lv1 = new LavaLouca ("é isso", "hoje tem", 50, 30.0);
		
		FornoEletrico Fe2 = new FornoEletrico ("filsher2.0", "filsherchef", 500, 34);
		
		System.out.println(g1.calcularConsumo());
		System.out.println(g2.calcularConsumo());
		
		System.out.println(g1.calcularConsumo(10));
		System.out.println(g2.calcularConsumo(10));
		System.out.println(f1.calcularConsumo());
		System.out.println(lv1.calcularConsumo(10));
		System.out.println(lv1.calcularConsumo());
		System.out.println(Fe2.calcularConsumo(10));
		System.out.println(Fe2.calcularConsumo());
		
		
	}

}
