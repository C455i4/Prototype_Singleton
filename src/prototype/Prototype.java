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
public class Prototype {

    public static void main(String[] args)throws CloneNotSupportedException {
      System.out.println("***Exemplo do padrão Prototype***\n");
    Sanduiche sanduiche1 = new sanduiche_vegano("sanduiche segunda feira","Pao vagano2", "molho especial");
    sanduiche1.preco = 5;
    
    Sanduiche sanduiche2 = new sanduiche_personalizado("sanduiche do Jorge", "pão de alho",
            "alface,tomate e molho picante");
    sanduiche2.preco = 8;
    

    Sanduiche san1;
    //Clone do Objeto sanduiche_vegano
    san1 = sanduiche1.clone();
    san1.preco = sanduiche1.preco + Sanduiche.setPreco();
    System.out.printf("Nome do Sanduiche: %s \n Tipo do Pão: %s \n Tipo do recheio: %s \n Preço: %d\n", 
           san1.getNome(), san1.getTipo_pao(), san1.getTipo_recheio(), san1.preco);
  
    
    Sanduiche san2;
    //Clone do Objeto sanduiche_personalizado
    san2 = sanduiche2.clone();
    san2.preco = sanduiche2.preco + Sanduiche.setPreco();
    System.out.printf("Nome do Sanduiche: %s \n Tipo do Pão: %s \n Tipo do recheio: %s \n Preço: %d\n", 
           san2.getNome(), san2.getTipo_pao(), san2.getTipo_recheio(), san2.preco);
    
    
    System.out.printf("Nome do Sanduiche: %s \n Tipo do Pão: %s \n Tipo do recheio: %s \n Preço: %d\n", 
            sanduiche1.getNome(), sanduiche1.getTipo_pao(), sanduiche1.getTipo_recheio(), sanduiche1.preco);
    System.out.printf("Nome do Sanduiche: %s \n Tipo do Pão: %s \n Tipo do recheio: %s \n Preço: %d\n", 
            sanduiche2.getNome(), sanduiche2.getTipo_pao(), sanduiche2.getTipo_recheio(), sanduiche2.preco);
    }
    
}
