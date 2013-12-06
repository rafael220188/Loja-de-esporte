package teste;

import pojo.Cliente;
import Loja.dao.LojaEsporteDAO;

public class DAOteste {
	
	public static void main(String[] args) {
	
		LojaEsporteDAO dao = new LojaEsporteDAO();
	
		System.out.println(dao.findListaClienteBy(new Cliente(2 ,"", "", "", "")));
		
	}
}
