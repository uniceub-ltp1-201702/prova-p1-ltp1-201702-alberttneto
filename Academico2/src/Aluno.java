import java.time.LocalDate;

public class Aluno {

	// Atributos	
	private String nome;
	private String RA;
	private String sexo;
	private LocalDate dataNascimento;


	
	

	
	// Metodo construtor
	public Aluno(String nome, String rA, String sexo, LocalDate dataNascimento) {
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;

	}
	
	//toString
	@Override
	public String toString() {
		return "Aluno [nome: " + nome + ", RA: " + RA + ", sexo: " + sexo + ", DataNascimento: " + getDataNscimentoComoString() +  "]";
	}
	
	public String getDataNscimentoComoString(){
		return dataNascimento.getDayOfMonth() + "/" +
				dataNascimento.getMonthValue() + "/" +
				dataNascimento.getYear();
		
	}
	

	// Metodo set get
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

/*	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}*/

	// Retorno nota
	
/*	public Double listarNota(){
		
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
		return nota;
		*/
		
		
	}
	
	
	
	


