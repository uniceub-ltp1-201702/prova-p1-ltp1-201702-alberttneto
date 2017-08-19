import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Iniciando os objetos
		

				
				
		Aluno a1 = new Aluno ("Alberto", "21707709", "M", LocalDate.of(1993, 7, 25));
		Disciplina d1 = new Disciplina("LTP1", "BCC", 4);
		Professor p1 = new Professor("Marcos", "456", "Mestrado", "05767743169");
		Turma t1 = new Turma("Turma A", p1.getNome(), d1.getNome());
		
		Aluno a2 = new Aluno("Joao", "1564654", "M", LocalDate.of(1995, 8, 2));
		
		
		
		//Adicionar a1 em t1
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
		
		System.out.println(t1.getAlunos().get(1).getNome());

	}

}
