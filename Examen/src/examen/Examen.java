/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import UAT3.Tarea1.Product;
import UAT3.Tarea1.Supermarket;

/**
 *
 * @author yago
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tarea1();
    }
    
    public static void Tarea1(){
        Supermarket market = new Supermarket();
        
        market.AddProduct(new Product(1, "Vinagre", 56));
        
        market.AddProduct(new Product(2, "Condimentos", 5));
        market.AddProduct(new Product(2, "Condimentos", 5));
        
        
        market.AddProduct(new Product(3, "Papas", 11));
        market.AddProduct(new Product(3, "Papas", 11));
          
        market.AddProduct(new Product(4, "Aceite de oliva", 23));
        market.AddProduct(new Product(4, "Aceite de oliva", 23));
        market.AddProduct(new Product(4, "Aceite de oliva", 23));
        
        market.SellProduct(new Product(4, "Aceite de oliva", 23));
        market.SellProduct(new Product(4, "Aceite de oliva", 23));
        
        market.Print();
    }
    
}
