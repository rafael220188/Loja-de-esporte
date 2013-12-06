package action;

import gui.JListaClientePanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class ListaClienteFecharAction extends AbstractAction {
	/**
	         * 
	         */
	private static final long serialVersionUID = 1L;

	/**
	         * 
	         */
	private JListaClientePanel panel;

	/**
	 * 
	 * @param jListaClientePanel
	 */
	public ListaClienteFecharAction(JListaClientePanel jListaClientePanel) {
		super("Fechar");
		this.panel = jListaClientePanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// panel.clear();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
		card.show(frame.getContentPane(), "branco");
	}

}