
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno("Alberto Ferreira Neto", "21707709", 24, "Ciencia da computa��o", "Noturno", "Maculino");
		
		Aluno a2 = new Aluno("Gago", "21708493", 17, "Ciencia da computa��o", "Noturno", "Masculino");
		
		Disciplina d1 = new Disciplina("Teoria Geral Administra��o", "Ciencia computa��o", 4);
	 
		Disciplina d2 = new Disciplina("logica programa��o", "Ciencia computa��o", 4);

		
		System.out.println(a1);
		System.out.println(d1+ "\n");
		System.out.println(a2);
		System.out.println(d2 + "\n" + "--------------------------------------------------------------------------------------------------------------------");
		System.out.println(a1.imprimirAluno());
		
	}
}
