/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estok.model;

/**
 *
 * @author Marinke
 */
public class Cliente {
    private int codigo;
    private String nome;

    public Cliente(int pcodigo, String pNome){
        codigo = pcodigo;
        nome = pNome;
    }

    public Cliente() {
       
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
