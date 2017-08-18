
public class Aluno {

	
	// Atributos de aluno
	
	private String nome;
	private String RA;
	private int idade;
	private String curso;
	private String turno;
	private String sexo;
	
	
	//Metodo construtor
	
	public Aluno(String nome, String rA, int idade, String curso, String turno, String sexo) {
		
		this.nome = nome;
		RA = rA;
		this.idade = idade;
		this.curso = curso;
		this.turno = turno;
		this.sexo = sexo;
	}
	
	
	// toString
	
	@Override
	public String toString() {
		return "Aluno [nome:" + nome + ", RA:" + RA + ", idade:" + idade + ", curso:" + curso + ", turno:" + turno
				+ ", sexo:" + sexo + "]";
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String imprimirAluno(){
		return "-------------Dados do Aluno------------" + "\n" +
					"Nome: " + getNome() + "\n" +
					"RA: " + getRA() + "\n" + 
					"Idade: " + getIdade() + "\n" +
					"Curso: " + getCurso() + "\n" +
					"Turno: " + getTurno() + "\n" +
					"Sexo: " + getSexo() + "\n";
					
	}
	
	
	
	
}
