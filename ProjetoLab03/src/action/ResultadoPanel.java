package action;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultadoPanel extends JPanel {
	
	private JLabel label = new JLabel();
	private JFrame frame;
	private CardLayout card;

	
	public ResultadoPanel(JFrame frame, CardLayout card){
		this.add(label);
		this.card = card;
		this.frame = frame;
	}


	public void setLabel(String string) {
		label.setText(string);
	}

}
