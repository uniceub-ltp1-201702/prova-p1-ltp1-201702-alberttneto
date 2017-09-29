import java.time.LocalDate;

public class Cliente {
	
	
	// Atributos
	private String nome;
	private String CPF;
	private LocalDate data;
	private String telefone;
	private String cidade;
	private String UF;

	// Metodo get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	//Metodo construtor
	public Cliente(String nome, String cPF, LocalDate data, String telefone, String cidade, String uF) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.data = data;
		this.telefone = telefone;
		this.cidade = cidade;
		UF = uF;
	}
	@Override
	
	//Metodo toString
	public String toString() {
		return "Cliente [Nome: " + nome + ", CPF: " + CPF + ", Data: " + data + ", Telefone: " + telefone + ", Cidade: "
				+ cidade + ", UF: " + UF + "\n";
	}
	

}
