package action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import pojo.Cliente;
import Loja.dao.LojaEsporteDAO;

public class PesquisaClienteAction extends AbstractAction {
	
private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;
	private PesquisaClientePanel panel;

	public PesquisaClienteAction(PesquisaClientePanel panel, JFrame frame, CardLayout card) {
		super("Pesquisa");
		this.panel = panel;
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente c = panel.getCliente();
		LojaEsporteDAO dao = new LojaEsporteDAO();
		dao.findClienteByCPF(c);
		//panel.clear();
		card.show(frame.getContentPane(), "branco");
	}
	
}
