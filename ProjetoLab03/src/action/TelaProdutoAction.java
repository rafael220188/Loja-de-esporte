package action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class TelaProdutoAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private CardLayout card;
	
	public TelaProdutoAction(CardLayout card, JFrame frame) {
		super("Cadastra produto");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		card.show(frame.getContentPane(), "Produto");
		
	}
}
