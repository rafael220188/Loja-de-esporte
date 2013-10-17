package gui;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Cliente;
import action.PesquisaClienteAction;

public class PesquisaClientePanel extends JPanel {
	
private static final long serialVersionUID = 1L;
	
	private JTextField cpf;

	public JTextField getCpf() {
		return cpf;
	}

	public Cliente getCliente() {
		return new Cliente( cpf.getText());
	}
	
	public void clear(){
		cpf.setText("");
	}
	
	public PesquisaClientePanel(JFrame frame, CardLayout card, JPanel panel) {
		JLabel label;

		setLayout(new FlowLayout());
		
		label = new JLabel("CPF");
		add(label);
		cpf = new JTextField(10);
		add(cpf);
		
		JButton button = new JButton(new PesquisaClienteAction(this, frame, card, panel));
		button.setToolTipText("Pesquisar");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);
	
	}	
}
