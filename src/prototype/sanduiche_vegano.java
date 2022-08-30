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
public class sanduiche_vegano extends Sanduiche {

    public sanduiche_vegano() {
    }

   public sanduiche_vegano(String n, String t, String ti) {
        nome = n;
        tipo_pao = t;
        tipo_recheio = ti;
    }
    
    @Override
       public Sanduiche clone() throws CloneNotSupportedException
       {
             return (sanduiche_vegano)super.clone();
       }
    
}
