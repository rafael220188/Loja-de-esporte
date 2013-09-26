package action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

/**
 * 
 * @author marco.mangan@gmail.com
 * 
 */
public class TelaClienteAction extends AbstractAction {

	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private CardLayout card;
	
	public TelaClienteAction(CardLayout card, JFrame frame) {
		super("Cadastra cliente");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		card.show(frame.getContentPane(), "Cliente");
		
	}

}