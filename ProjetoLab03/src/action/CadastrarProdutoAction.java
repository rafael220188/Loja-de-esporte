package action;

import gui.CadastrarProdutoPanel;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import pojo.Produto;
import Loja.dao.LojaEsporteDAO;

/**
 * 
 * @author rafaelsmdm@gmail.com
 *
 */
public class CadastrarProdutoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;
	private CadastrarProdutoPanel panel;

	public CadastrarProdutoAction(CadastrarProdutoPanel panel, JFrame frame, CardLayout card) {
		super("Cadastrar");
		this.panel = panel;
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Produto c1 = panel.getProduto();
		//System.out.println(c);
		LojaEsporteDAO dao = new LojaEsporteDAO();
		dao.insertProduto(c1);
		panel.clear();
		card.show(frame.getContentPane(), "branco");
	}
}