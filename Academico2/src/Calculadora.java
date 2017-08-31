
public class Calculadora {

	public String mencaoAluno(double nota){
	
		
		String mencao = "";
		
		
		if (nota >= 9){
			mencao = "SS";
		}else{
			if(nota >=7 ){
				mencao = "MS";
			} else {
				if(nota >=5){			
					mencao = "MM";
				}else {
					if(nota >=3){
						mencao = "MI";
					}else {
						if (nota >=0.1){
							mencao = "II";
						}else{
							mencao = "SR";
						}
					}
				}
			}
			
			}
		
		return mencao;
	}

/*		public String AprovAluno (String mencao){
			String resultado = "";*/
/*			
			if (mencao == "SS" || "MS" || "MM" ) {
			resultado = "Aprovado";
				
			} else {

			}
			return resultado;
		}
			*/
			
			
			
			
			

		

	}
	

