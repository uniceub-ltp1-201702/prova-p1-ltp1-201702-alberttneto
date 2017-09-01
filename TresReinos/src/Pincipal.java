import java.util.ArrayList;

public class Pincipal {

	public static void main(String[] args) {
		// Instanciar os 3 governantes
		Governante montante = new Governante (20000, 5000, 4000, "Montante", 0, 20000, 40000);
		Governante lenha = new Governante (10000, 500, 25000, "Lenha", 0, 0, 100000);
		Governante clareza = new Governante (120000, 200, 7000, "Clareza", 5000, 10000, 0);
		
		//Lista de governantes
		
		ArrayList<Governante> governante = new ArrayList <Governante>();
		governante.add(montante);
		governante.add(lenha);
		governante.add(clareza);
		
		//Instaciar a classe solução
		
		Solucao s = new Solucao();
		System.out.println(s.getQtdeTotal("ouro", governante));
		System.out.println(s.getQtdeTotal("madeira", governante));
		System.out.println(s.getQtdeTotal("agua", governante));
			
		
		System.out.println(s.getQtdFicarVivo("ouro", governante));
		System.out.println(s.getQtdFicarVivo("madeira", governante));
		System.out.println(s.getQtdFicarVivo("agua", governante));
			
		
		
		System.out.println(s.calcularQtdViagens(governante, governante1));
	}

}
