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
public class sanduiche_personalizado extends Sanduiche {

    public sanduiche_personalizado() {
    }


    public sanduiche_personalizado(String n, String t, String ti) {
        nome = n;
        tipo_pao = t;
        tipo_recheio = ti;
    }
    
    
    
    @Override
       public Sanduiche clone() throws CloneNotSupportedException
       {
             return (sanduiche_personalizado)super.clone();
       }
}
