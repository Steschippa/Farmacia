package br.com.estok.comum;

import br.com.estok.model.Cliente;
import br.com.estok.persistencia.DAOCliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/*
 *
 * @author Marinke
 */
public class ClienteComboModel extends AbstractListModel<String> implements ComboBoxModel<String> {

    private List<String> lista;
    private String selecionado;

    public ClienteComboModel() {
        try {
            lista = DAOCliente.class.newInstance().findAllNames();
            lista.add(0, "SELECIONE UM CLIENTE");
        } catch (Exception ex) {
            Logger.getLogger(ClienteComboModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public String getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selecionado = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selecionado;
    }
}