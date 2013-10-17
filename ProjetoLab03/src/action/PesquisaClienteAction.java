package action;

import gui.PesquisaClientePanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pojo.Cliente;
import Loja.dao.LojaEsporteDAO;

public class PesquisaClienteAction extends AbstractAction {
	
private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;
	private PesquisaClientePanel panel;
	private ResultadoPanel panel2;

	public PesquisaClienteAction(PesquisaClientePanel panel, JFrame frame, CardLayout card, JPanel panel2) {
		super("Pesquisa");
		this.panel = panel;
		this.frame = frame;
		this.card = card;
		this.panel2 = (ResultadoPanel)panel2;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Cliente c = panel.getCliente();
		LojaEsporteDAO dao = new LojaEsporteDAO();
		c = dao.findClienteByCPF(panel.getCpf().getText());
		panel.clear();
		card.show(frame.getContentPane(), "branco");
			
		//mandar pro painel
		
		panel2.setLabel("Codigo: " +c.getCodCliente() +"   Nome: "+c.getNome() +"   CPF: " +c.getCpf()
				+"   Endereco: "+c.getEndereco() +"   Telefone: "+c.getTelefone());
		card.show(frame.getContentPane(), "Resultado");
	}
	
}
