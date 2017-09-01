import java.util.ArrayList;

public class Solucao {
	
	//Metodo para questao A
	
	public int getQtdeTotal(String recurso,ArrayList<Governante> governante){

	//Testar o tipo de recurso
		
		
	
	
	
		int resultado = 0;
	
	switch (recurso) {

	case "ouro:": 
	for (int i = 0; i < governante.size(); i++) {
		resultado = resultado +governante.get(i).getOuro();
	}
	return resultado;
		
		
		case "madeira":
			for (int i = 0; i < governante.size(); i++) {
				resultado = resultado +governante.get(i).getMadeira();

	}
			return resultado;
			
		case "Agua":
			for (int i = 0; i < governante.size(); i++) {
				resultado = resultado +governante.get(i).getAgua();
				
			}
			
			return resultado;
			
			default:
				return resultado;
	}
	}	
				
				//metodo da resposta da questao B
				
				public String getQtdFicarVivo(String nomeGovernante, ArrayList<Governante> governante){
					
					String resultado = "";
					
					//buscar o governante na list com base no nome
					for (int i = 0; i < governante.size(); i++) {
						if (governante.get(i).getNome().equals(nomeGovernante)) {
							resultado = "Pedido do governante" + nomeGovernante +"\n"+
						"ouro: " + governante.get(i).getPedidoOuro() + "\n" +
						"madeira: " + governante.get(i).getPedidoMadeira() + "\n" +
						"agua: " + governante.get(i).getPedidoAgua();
												
							
						}
						
					}
					return resultado;
				}
				

				
			public int calcularQtdViagens (String governante, ArrayList<Governante> governante1){
				int resultado = 0;
				
				
				for (int i = 0; i < governante1.size(); i++) {
					Object nomeGovernante = null;
					if (governante1.get(i).getNome().equals(nomeGovernante)) {
						resultado = (governante1.get(i).getPedidoOuro() / 50) +
											(governante1.get(i).getPedidoMadeira() / 100) +
											(governante1.get(i).getPedidoOuro() / 1000);
						
					}
					
				}
				return resultado;
			}



	}

