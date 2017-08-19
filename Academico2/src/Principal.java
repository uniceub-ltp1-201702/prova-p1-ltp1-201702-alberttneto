import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Iniciando os objetos
		

				
				
		Aluno a1 = new Aluno ("Alberto", "21707709", "M", LocalDate.of(1993, 7, 25));
		Disciplina d1 = new Disciplina("LTP1", "BCC", 4);
		Professor p1 = new Professor("Marcos", "456", "Mestrado", "05767743169");
		Turma t1 = new Turma("Turma A", p1.getNome(), d1.getNome());
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
		

	}

}
