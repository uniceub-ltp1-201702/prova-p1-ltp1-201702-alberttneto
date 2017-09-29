import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ligacao {
	
	// Atributos
	public int codigo;
	public String telDestino;
	public LocalDateTime dtHoraIni;
	public LocalDateTime dtHoraFim;
	public String cidadeDest;
	public String UFDest;
	public Cliente clientes;
	
	//Metodo get e set
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTelDestino() {
		return telDestino;
	}
	public void setTelDestino(String telDestino) {
		this.telDestino = telDestino;
	}
	public LocalDateTime getDtHoraIni() {
		return dtHoraIni;
	}
	public void setDtHoraIni(LocalDateTime dtHoraIni) {
		this.dtHoraIni = dtHoraIni;
	}
	public LocalDateTime getDtHoraFim() {
		return dtHoraFim;
	}
	public void setDtHoraFim(LocalDateTime dtHoraFim) {
		this.dtHoraFim = dtHoraFim;
	}
	public String getCidadeDest() {
		return cidadeDest;
	}
	public void setCidadeDest(String cidadeDest) {
		this.cidadeDest = cidadeDest;
	}
	public String getUFDest() {
		return UFDest;
	}
	public void setUFDest(String uFDest) {
		UFDest = uFDest;
	}
	public Cliente getClientes() {
		return clientes;
	}
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	
	// Metodo construtor
	public Ligacao(int codigo, String telDestino, LocalDateTime dtHoraIni, LocalDateTime dtHoraFim, String cidadeDest,
			String uFDest, Cliente clientes) {
		super();
		this.codigo = codigo;
		this.telDestino = telDestino;
		this.dtHoraIni = dtHoraIni;
		this.dtHoraFim = dtHoraFim;
		this.cidadeDest = cidadeDest;
		UFDest = uFDest;
		this.clientes = clientes;
	}
	


	// Metodo toString

	@Override
	public String toString() {
		return "Ligacao [Codigo: " + codigo + ", telDestino=" + telDestino + ", dtHoraIni=" + dtHoraIni + ", dtHoraFim="
				+ dtHoraFim + ", cidadeDest=" + cidadeDest + ", UFDest=" + UFDest + ", clientes=" + clientes + "\t";
	}



	
	
	

}
