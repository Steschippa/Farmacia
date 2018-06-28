package br.com.estok.comum;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import br.com.estok.model.Cliente;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

    private Vector<String> colunas;
    private Vector<Vector> linhas;

    public ClienteTableModel() {
        colunas = new Vector<String>();
        colunas.add("Código");
        colunas.add("Nome");
       // colunas.add("CPF");

        linhas = new Vector<Vector>();
    }

    public void preencher(List<Cliente> lista) {        
        linhas.removeAllElements();
            
        for (Cliente r : lista) {
            Vector<Object> linha = new Vector<Object>();
            
            linha.add(r.getCodigo());
            linha.add(r.getNome());
          
            linhas.add(linha);
        }
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return linhas.get(rowIndex).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas.get(column);
    }
}
