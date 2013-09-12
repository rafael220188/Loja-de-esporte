package gui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Cliente;
import action.CadastrarClienteAction;

public class CadastrarClientePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField nome;
	private JTextField endereco;
	private JTextField cpf;
	private JTextField telefone;

	public Cliente getCliente() {
		return new Cliente( nome.getText(), endereco.getText(), cpf.getText(),telefone.getText());
	}

	public CadastrarClientePanel() {
		JLabel label;

		setLayout(new FlowLayout());
		
		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		add(nome);
		
		label = new JLabel("Endereco");
		add(label);
		endereco = new JTextField(10);
		add(endereco);
		
		label = new JLabel("CPF");
		add(label);
		cpf = new JTextField(10);
		add(cpf);

		label = new JLabel("Telefone");
		add(label);
		telefone = new JTextField(10);
		add(telefone);

		JButton button = new JButton(new CadastrarClienteAction(this));
		button.setToolTipText("Cadastrar cliente");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);
	}

}	