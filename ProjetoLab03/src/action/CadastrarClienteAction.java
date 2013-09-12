package action;

import gui.CadastrarClientePanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pojo.Cliente;
import Loja.dao.LojaEsporteDAO;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class CadastrarClienteAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CadastrarClientePanel panel;

	public CadastrarClienteAction(CadastrarClientePanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente c = panel.getCliente();
		//System.out.println(c);
		LojaEsporteDAO dao = new LojaEsporteDAO();
		dao.insertCliente(c);
	}
}