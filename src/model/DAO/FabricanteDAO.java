/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.DAO;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Fabricante;


/**
 * Nova Classe 
 * @author FGD
 * @since data 
 */
public class FabricanteDAO {
    
    public void create(Fabricante f) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO fabricante (cdgfabricante,nome,pais)VALUES(?,?,?)");
            stmt.setInt(1, f.getCodigof());
            stmt.setString(2, f.getNomef());
            stmt.setString(3, f.getPais());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
