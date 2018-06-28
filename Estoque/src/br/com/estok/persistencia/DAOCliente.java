/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estok.persistencia;

import br.com.estok.model.Cliente;
import br.com.estok.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marinke
 */
public class DAOCliente {
    private static Connection conexao;

    public DAOCliente(){
        try {
            conexao = ConnectionFactory.conectar();
        } catch (Exception ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean salvar(Cliente c1) {
        return true;
    }

    public boolean inserir(Cliente c) {
        //salvar dados no banco         
        String sql = "insert into cliente values(null,'"
                + c.getNome()
                + "')";
        StringBuffer sb = new StringBuffer(sql);
        PreparedStatement statement;
        try {
            statement = conexao.prepareStatement(sb.toString());
            //ResultSet resultset = statement.executeQuery();
            statement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
     
        
    }

    public List<String> findAllNames() {
        //banco de dados
        Cliente c1 = new Cliente(20, "Breno");
        Cliente c2 = new Cliente(10, "Bruna");

        List clientes = new ArrayList<Cliente>();
        clientes.add(c1.getNome());
        clientes.add(c2.getNome());
        
        return clientes;
    }
    
    public List<Cliente> findAll() {
        Cliente c1 = new Cliente(20, "Breno");
        Cliente c2 = new Cliente(10, "Bruna");

        List clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);
        
        return clientes;
    }
    
    
    
}
