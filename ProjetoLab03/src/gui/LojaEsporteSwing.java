package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import action.SairAction;
import action.SobreAction;


/**
 * 
 * @author marco.mangan@gmail.com
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

		JMenuBar mb = new JMenuBar();
		frame.setJMenuBar(mb);
		
		//atalho  alt + a
		JMenu arquivo = new JMenu("Arquivo");
		arquivo.setMnemonic(KeyEvent.VK_A);
		mb.add(arquivo);
		
		//atalho  alt + u
		JMenu ajuda = new JMenu("Ajuda");
		ajuda.setMnemonic(KeyEvent.VK_U);
		mb.add(ajuda);
		
		//JMenuItem cadastraCliente = new JMenuItem(new CadastrarClienteAction());
		//arquivo.add(cadastraCliente);
		
		//atalho ctrl + q
		JMenuItem sair = new JMenuItem(new SairAction());
		arquivo.add(sair);
		sair.setMnemonic(KeyEvent.VK_S);
		sair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		
		// atalho alt + s
		JMenuItem sobre = new JMenuItem(new SobreAction(frame));
		ajuda.add(sobre);
		sobre.setMnemonic(KeyEvent.VK_S);
		
		JPanel panel = new CadastrarClientePanel();															
		//JPanel panel2 = new CadastrarProdutoPanel();
		
		//add(button);
		
		
		frame.getContentPane().add(panel);
		//frame.getContentPane().add(panel2);
		
		frame.setPreferredSize(new Dimension(900,200));
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