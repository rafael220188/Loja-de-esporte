package action;

import gui.CadastrarProdutoPanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pojo.Produto;
import Loja.dao.LojaEsporteDAO;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class CadastrarProdutoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CadastrarProdutoPanel panel;

	public CadastrarProdutoAction(CadastrarProdutoPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Produto c1 = panel.getProduto();
		//System.out.println(c);
		LojaEsporteDAO dao = new LojaEsporteDAO();
		dao.insertProduto(c1);
		panel.clear();
	}
}