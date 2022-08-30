/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Cassia
 */
public abstract class Sanduiche implements Cloneable {
    public String nome;
    public String tipo_pao;
    public String tipo_recheio;
    public int preco;

    public Sanduiche() {
    }

    public Sanduiche(String nome, String tipo_pao, String tipo_recheio, int preco) {
        this.nome = nome;
        this.tipo_pao = tipo_pao;
        this.tipo_recheio = tipo_recheio;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_pao() {
        return tipo_pao;
    }

    public void setTipo_pao(String tipo_pao) {
        this.tipo_pao = tipo_pao;
    }

    public String getTipo_recheio() {
        return tipo_recheio;
    }

    public void setTipo_recheio(String tipo_recheio) {
        this.tipo_recheio = tipo_recheio;
    }
    
    public static int setPreco(){
             int preco = 10;
             return preco;
       }
    
    public Sanduiche clone() throws CloneNotSupportedException
       {
             return (Sanduiche)super.clone();
       }
}
