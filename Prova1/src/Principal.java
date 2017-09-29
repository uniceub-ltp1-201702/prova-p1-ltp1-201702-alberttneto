import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		//nome: Alberto Ferreira Neto
		//RA: 21707709
		
		

		BDSimulado bds = new BDSimulado();
		
		
	 ArrayList<Cliente> clientes = bds.getClientes();
	 ArrayList<Ligacao>  ligacoes = bds.getLigacoes();
	 
	 String getInfoCliente = bds.getInfoCliente("José das Couves");
	 System.out.println(getInfoCliente + "\n");
	 
	 ArrayList<Ligacao> getLigacoesPorCliente = bds.ligacoesPorCliente("Otaviano Neves");
	 System.out.println("Ligações realizadas pelo cliente: " + "\n" + getLigacoesPorCliente + "\n");
	 
	 int getLigacoesPorUF = bds.ligacoesPorUF("RJ");
	 System.out.println("Número de ligações por UF: " + getLigacoesPorUF + "\n");
	 
	 ArrayList<Integer> getLigacoesUFDiferente = bds.ligacoesUFDiferente();
	 System.out.println("Ligações realizadas por UF diferente:" + getLigacoesUFDiferente + "\n");
	 
	 ArrayList<Ligacao> getContaCliente = bds.contaPorCliente("José das Couves");
	 System.out.println(getContaCliente);
	}

}
