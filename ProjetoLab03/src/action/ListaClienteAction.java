package action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class ListaClienteAction extends AbstractAction {

	/**
	         * 
	         */
	private static final long serialVersionUID = 1L;

	private JFrame frame;
	private CardLayout card;

	public ListaClienteAction(JFrame frame, CardLayout card) {
		super("Consultar clientes");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO: 
		card.show(frame.getContentPane(), "TelaListaCliente");
	}
}