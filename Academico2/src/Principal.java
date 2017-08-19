import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Iniciando os objetos
		

				
				

		Disciplina d1 = new Disciplina("LTP1", "BCC", 4);
		Professor p1 = new Professor("Marcos", "456", "Mestrado", "05767743169");
		Turma t1 = new Turma("Turma A", p1.getNome(), d1.getNome());

		
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);


		
		//Instanciar objeto da classe aluno
		Aluno a1 = new Aluno ("Alberto", "21707709", "M", LocalDate.of(1993, 7, 25));
		Aluno a2 = new Aluno("Kekel", "1564654", "M", LocalDate.of(1995, 8, 2));
		Aluno a3 = new Aluno("Lan", "21707710", "M", LocalDate.of(1996, 8, 13));
		Aluno a4 = new Aluno("Juliana", "21707340", "F", LocalDate.of(2000, 4, 4));
	    Aluno a5 = new Aluno("Maria", "21707450", "F", LocalDate.of(1993, 2, 5));		
	    Aluno a6 = new Aluno("Janaina", "21707780", "F", LocalDate.of(1990, 1, 28));
		
		
		//Adicionar a1 em t1
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.adicionarAluno(a6);
		


/*		double nota = 0.8; 	
		
		if (nota <= 10.0 && nota >= 9.0){
			System.out.println("SS");			
		}else if (nota <= 8.9 && nota >=7.0 ){
			System.out.println("MS");
		}else if (nota <= 6.9 && nota >= 5.0){
			System.out.println("MM");
		}else if (nota <= 4.9 && nota >= 3.0){
			System.out.println("MI");
		} else if (nota <= 2.9 && nota >=0.1){
			System.out.println("II");
		}else if ( nota == 0.0){
			System.out.println("SR");		
		}
		if (nota < 5.0 ){
			System.out.println("Reprovado");
		}else if (nota >= 5.0){
			System.out.println("Aprovado");
		}
		
		*/
		
/*		double SR = 0;
	for (double i = 0; i < 10.0; i++) {
		if (i == nota){
			System.out.println("SR");
			
		}
	 
		
	}*/
		
	}

}
