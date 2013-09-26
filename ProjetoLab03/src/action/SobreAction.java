package action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class SobreAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Sobre");
		JOptionPane.showMessageDialog(frame, "v. 1.0 (c) LAPRO III, FSPOA.",
				"Loja de esporte", JOptionPane.INFORMATION_MESSAGE);
	}

}