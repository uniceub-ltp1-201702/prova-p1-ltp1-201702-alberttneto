
public class Nota {
	//Atributos
	private double nota;
	
	
	//toString
	@Override
	public String toString() {
		return "Nota [nota=" + nota + "]";
	}

	//Metodo construtor
	public Nota(double nota) {
		super();
		this.nota = nota;
	}

	//Set e Get
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	

}
