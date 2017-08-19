import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// Iniciando os objetos
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.YEAR, 1993);
		dataNascimento.set(Calendar.MONTH, Calendar.AUGUST);
		dataNascimento.set(Calendar.DAY_OF_MONTH, 25);
				
				
		Aluno a1 = new Aluno ("Alberto", "21707709", "M", dataNascimento);
		Disciplina d1 = new Disciplina("LTP1", "BCC", 4);
		Professor p1 = new Professor("Marcos", "456", "Mestrado", "05767743169");
		Turma t1 = new Turma("Turma A", p1.getNome(), d1.getNome());
		
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(p1);
		System.out.println(t1);
		

	}

}
