package gui;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Cliente;

public class PesquisaMostraClientePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField nome;
	private JTextField endereco;
	private JTextField cpf;
	private JTextField telefone;
	
	

	public PesquisaMostraClientePanel(JTextField nome, JTextField endereco,
			JTextField cpf, JTextField telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	

	public JTextField getNome() {
		return nome;
	}

	public JTextField getEndereco() {
		return endereco;
	}

	public JTextField getCpf() {
		return cpf;
	}

	public JTextField getTelefone() {
		return telefone;
	}


	Cliente c = new Cliente();
	
	public PesquisaMostraClientePanel(JFrame frame, CardLayout card) {
		JLabel label;
		
		setLayout(new FlowLayout());
		
		
		label = new JLabel(c.getNome());
		add(label);
		
		label = new JLabel(c.getEndereco());
		add(label);
		
		label = new JLabel(c.getCpf());
		add(label);		
		label = new JLabel(c.getTelefone());
		add(label);
	
	}

	public PesquisaMostraClientePanel() {
		// TODO Auto-generated constructor stub
	}

}
