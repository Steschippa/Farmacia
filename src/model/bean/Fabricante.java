/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.bean;

/**
 * Nova Classe 
 * @author FGD
 * @since data 
 */
public class Fabricante {
   
   private int codigof;
   private String nomef;
   private String pais;

    public Fabricante(int codigof, String nomef, String pais) {
        this.codigof = codigof;
        this.nomef = nomef;
        this.pais = pais;
    }

    public Fabricante() {
    }

    public int getCodigof() {
        return codigof;
    }

    public void setCodigof(int codigof) {
        this.codigof = codigof;
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    
    
    
}
