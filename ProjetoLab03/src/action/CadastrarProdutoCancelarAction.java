package action;

import gui.CadastrarClientePanel;
import gui.CadastrarProdutoPanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class CadastrarProdutoCancelarAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;
	private CadastrarProdutoPanel panel;

	public CadastrarProdutoCancelarAction(CadastrarProdutoPanel panel, JFrame frame, CardLayout card) {
		super("Cancelar");
		this.panel = panel;
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		panel.clear();
		card.show(frame.getContentPane(), "branco");
	}

}