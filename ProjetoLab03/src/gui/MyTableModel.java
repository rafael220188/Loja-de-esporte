package gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import pojo.Cliente;
import Loja.dao.LojaEsporteDAO;

public class MyTableModel extends AbstractTableModel {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;
        
        private List<Cliente> mvs;

        public MyTableModel(Cliente c) {
        		LojaEsporteDAO dao = new LojaEsporteDAO();
                mvs = dao.findListaClienteBy(c);
        }

        @Override
        public int getColumnCount() {
                return 3;
        }

        @Override
        public int getRowCount() {
                return mvs.size();
        }

        @Override
        public Object getValueAt(int lin, int col) {
                Cliente m = mvs.get(lin);
                switch (col) {
                case 0:
                        return m.getNome();
                case 1:
                        return m.getCodCliente();
                case 2:
                        return m.getCpf();
                default:
                        return "*ERRO*";
                }
        }
}