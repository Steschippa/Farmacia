

package model.bean;

/**
 * Nova Classe 
 * @author FGD
 * @since 17/06/2018
 */
public class Produto {
    
    private int codigo;
    private String nome;
    private int codfbr;
    private int qtd;
    private double valor;

    public Produto(int codigo, String nome, int codfbr, int qtd, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.codfbr = codfbr;
        this.qtd = qtd;
        this.valor = valor;
    }

    public Produto() { 
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodfbr() {
        return codfbr;
    }

    public void setCodfbr(int codfbr) {
        this.codfbr = codfbr;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
            
    
    
}

