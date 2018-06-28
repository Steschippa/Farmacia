/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author Samuelson
 */
public class ProdutoDAO {

    public void create (Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (codigo,nome,cdgfabricante,quantidade,valor)VALUES(?,?,?,?,?)");
            stmt.setInt(1, p.getCodigo());
            stmt.setString(2, p.getNome());
            stmt.setInt(3, p.getCodfbr());
            stmt.setInt(4, p.getQtd());
            stmt.setDouble(5, p.getValor());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public List<Produto> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodigo(rs.getInt("codigo"));
                produto.setNome(rs.getString("Nome"));
                produto.setCodfbr(rs.getInt("cdgfabricante"));
                produto.setQtd(rs.getInt("quantdade"));
                produto.setValor(rs.getDouble("valor"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public void update (Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET nome = ?,cdgfabricante = ?,quantidade = ?,valor = ? WHERE codigo = ? ");
            
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getCodfbr());
            stmt.setInt(3, p.getQtd());
            stmt.setDouble(4, p.getValor());
            stmt.setInt(5, p.getCodigo());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado  com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
}
    public void delete (Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE codigo = ? ");
           
              stmt.setInt(1, p.getCodigo());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUIDO com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao EXCLUIR: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}