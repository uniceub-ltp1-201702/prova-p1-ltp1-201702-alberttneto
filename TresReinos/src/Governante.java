
public class Governante {
	
	//Atributos
	
	private int ouro;
	private int agua;
	private int madeira;
	private String nome;
	private int pedidoOuro;
	private int pedidoAgua;
	private int pedidoMadeira;
	
	
	
	//set & get
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public int getMadeira() {
		return madeira;
	}
	public void setMadeira(int madeira) {
		this.madeira = madeira;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPedidoOuro() {
		return pedidoOuro;
	}
	public void setPedidoOuro(int pedidoOuro) {
		this.pedidoOuro = pedidoOuro;
	}
	public int getPedidoAgua() {
		return pedidoAgua;
	}
	public void setPedidoAgua(int pedidoAgua) {
		this.pedidoAgua = pedidoAgua;
	}
	public int getPedidoMadeira() {
		return pedidoMadeira;
	}
	public void setPedidoMadeira(int pedidoMadeira) {
		this.pedidoMadeira = pedidoMadeira;
	}
	//Metodo construtor
	public Governante(int ouro, int agua, int madeira, String nome, int pedidoOuro, int pedidoAgua, int pedidoMadeira) {
		super();
		this.ouro = ouro;
		this.agua = agua;
		this.madeira = madeira;
		this.nome = nome;
		this.pedidoOuro = pedidoOuro;
		this.pedidoAgua = pedidoAgua;
		this.pedidoMadeira = pedidoMadeira;
		
	
	}
	

	
	
	


	
	

}
