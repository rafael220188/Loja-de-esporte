package action;

import gui.CadastrarClientePanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

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
	
	private JFrame frame;
	private CardLayout card;
	private CadastrarClientePanel panel;

	public CadastrarClienteAction(CadastrarClientePanel panel, JFrame frame, CardLayout card) {
		super("Cadastrar");
		this.panel = panel;
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente c = panel.getCliente();
		LojaEsporteDAO dao = new LojaEsporteDAO();
		dao.insertCliente(c);
		panel.clear();
		card.show(frame.getContentPane(), "branco");
	}
}