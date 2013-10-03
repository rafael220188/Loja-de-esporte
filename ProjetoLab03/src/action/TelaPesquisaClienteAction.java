package action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class TelaPesquisaClienteAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private CardLayout card;
	
	public TelaPesquisaClienteAction(CardLayout card, JFrame frame) {
		super("Pesquisar cliente");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		card.show(frame.getContentPane(), "Cliente");
		
	}

}
