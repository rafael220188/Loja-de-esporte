package action;
  
 import gui.CadastrarClientePanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

 
 public class CadastrarClienteCancelarAction extends AbstractAction {
 	/**
 	 * 
 	 */
 	private static final long serialVersionUID = 1L;

 	/**
 	 * 
 	 */
 	private CadastrarClientePanel panel;

 	/**
 	 * 
 	 * @param panel
 	 */
 	public CadastrarClienteCancelarAction(CadastrarClientePanel panel) {
 		super("Cancelar");
 		this.panel = panel;
 	}

 	@Override
 	public void actionPerformed(ActionEvent arg0) {
 		
 		panel.clear();
 	}

 }