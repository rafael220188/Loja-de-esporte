package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import action.ListaClienteAction;
import action.ResultadoPanel;
import action.SairAction;
import action.SobreAction;
import action.TelaClienteAction;
import action.TelaPesquisaClienteAction;
import action.TelaProdutoAction;

/**
 * 
 * @author rafaelsmdm@gmail.com
 * 
 */
public class LojaEsporteSwing {
	private static final CadastrarProdutoPanel CadastrarProdutoPanel = null;

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Loja de esporte");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				LojaEsporteSwing.class.getResource("/gui/111.png")));

		JMenuBar mb = new JMenuBar();
		frame.setJMenuBar(mb);

		// atalho alt + a
		JMenu arquivo = new JMenu("Arquivo");
		arquivo.setMnemonic(KeyEvent.VK_A);
		mb.add(arquivo);
		
		// atalho alt + P
		JMenu pesquisar = new JMenu("Pesquisar");
		pesquisar.setMnemonic(KeyEvent.VK_P);
		mb.add(pesquisar);
		
		// atalho alt + L
		JMenu listar = new JMenu("Listar");
		listar.setMnemonic(KeyEvent.VK_L);
		mb.add(listar);

		// atalho alt + u
		JMenu ajuda = new JMenu("Ajuda");
		ajuda.setMnemonic(KeyEvent.VK_U);
		mb.add(ajuda);
		
		
		CardLayout card = new CardLayout(0, 0);
		// atalho alt + C
		JMenuItem cadastraCliente = new JMenuItem(new TelaClienteAction(card, frame));
		cadastraCliente.setMnemonic(KeyEvent.VK_C);
		arquivo.add(cadastraCliente);
		
		// atalho alt + O
		JMenuItem cadastraProduto = new JMenuItem(new TelaProdutoAction(card, frame));
		cadastraProduto.setMnemonic(KeyEvent.VK_O);
		arquivo.add(cadastraProduto);
		
		// atalho alt + C
		JMenuItem pesquisaCliente = new JMenuItem(new TelaPesquisaClienteAction(card, frame));
		pesquisaCliente.setMnemonic(KeyEvent.VK_C);
		pesquisar.add(pesquisaCliente);
		
		// atalho alt + T
		JMenuItem listaCliente = new JMenuItem(new ListaClienteAction(frame, card));
		listaCliente.setMnemonic(KeyEvent.VK_T);
		listar.add(listaCliente);
		
		// atalho ctrl + q
		JMenuItem sair = new JMenuItem(new SairAction());
		arquivo.add(sair);
		sair.setMnemonic(KeyEvent.VK_S);
		sair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
				ActionEvent.CTRL_MASK));

		// atalho alt + s
		JMenuItem sobre = new JMenuItem(new SobreAction(frame));
		ajuda.add(sobre);
		sobre.setMnemonic(KeyEvent.VK_S);
		
		frame.getContentPane().setLayout(card);
		
		frame.getContentPane().add(new JPanel(), "branco");
		
		JPanel panel = new CadastrarClientePanel(frame, card);
		frame.getContentPane().add(panel, "Cliente");
		
		JPanel panel2 = new CadastrarProdutoPanel(frame, card);
		frame.getContentPane().add(panel2, "Produto");
		
		JPanel panel4 = new ResultadoPanel(frame, card);
		frame.getContentPane().add(panel4, "Resultado");
		
		JPanel panel3 = new PesquisaClientePanel(frame, card, panel4);
		frame.getContentPane().add(panel3, "Pesquisa");
		
		
		JPanel panel5 = new JListaClientePanel(frame, card);
		frame.getContentPane().add(panel5, "TelaListaCliente");
		
		
		frame.setPreferredSize(new Dimension(900, 200));
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}