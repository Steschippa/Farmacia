

package br.com.estok.model;

/**
 * Nova Classe 
 * @author FGD
 * @since 17/06/2018
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private float valor;
    private int codfbr;
    private int qtd;
    
            
    public Produto (int pcodigo, String pNome ,float valor,int codfbr,int qtd ){
        codigo = pcodigo;
        nome = pNome;
        this.valor = valor;
        this.codfbr = codfbr;
        this.qtd = qtd;
    }

    public Produto () {
       
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
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int getCodfbr() {
        return codfbr;
    }

    public void setCodfbr (int codfbr) {
        this.codfbr = codfbr;
    }
    
    public int getQtd() {
        return qtd;
    }

    public void setQtd (int qtd) {
        this.qtd = qtd;
    }
    
}

