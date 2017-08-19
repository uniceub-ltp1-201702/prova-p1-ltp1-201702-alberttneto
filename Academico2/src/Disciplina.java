
public class Disciplina {

	//Atributos disciplina	
	public String nome;
	public String curso;
	public int cargaHoraria;
	
	// Metodo construtor
	public Disciplina(String nome, String curso, int cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;			
	}
	
	// toString
	@Override
	public String toString() {
		return "Disciplina [nome: " + nome + ", curso: " + curso + ", cargaHoraria: "
				+ cargaHoraria + "]";
	}
	
	// Metodo set e get
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
