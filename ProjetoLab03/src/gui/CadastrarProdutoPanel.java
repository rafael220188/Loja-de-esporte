package gui;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Produto;
import action.CadastrarProdutoAction;
import action.CadastrarProdutoCancelarAction;

public class CadastrarProdutoPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField codigo;
	private JTextField nome;
	private JTextField preco;
	private JTextField quantidade;

	public Produto getProduto() {
		return new Produto( codigo.getText(), nome.getText(), preco.getText(),quantidade.getText());
	}
	
	public void clear(){
		codigo.setText("");
		nome.setText("");
		preco.setText("");
		quantidade.setText("");
	}

	public CadastrarProdutoPanel(JFrame frame, CardLayout card) {
		JLabel label;

		setLayout(new FlowLayout());
		
		label = new JLabel("Codigo");
		add(label);
		codigo = new JTextField(4);
		add(codigo);
		
		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		add(nome);
		
		label = new JLabel("Preco");
		add(label);
		preco = new JTextField(10);
		add(preco);
		
		label = new JLabel("Quantidade");
		add(label);
		quantidade = new JTextField(4);
		add(quantidade);

		JButton button = new JButton(new CadastrarProdutoAction(this, frame, card));
		button.setToolTipText("Cadastrar Produto");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);
		
		button = new JButton(new CadastrarProdutoCancelarAction(this, frame, card));
		button.setToolTipText("Cancelar cadastro do produto");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);
		
	}

}