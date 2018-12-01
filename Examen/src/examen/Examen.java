/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import TDAList.INode;
import TDAList.Node;
import TDAList.SortedList.SortedList;
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
//        Tarea1();
        TestSortList();
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
    
    
    private static void TestSortList(){
        SortedList<Integer> instance = new SortedList<Integer>(); 
        INode n1 = new Node("uno",1);
        INode n2 = new Node("dos",2);
        INode n3 = new Node("tres",3);
        INode n4 = new Node("cuatro",4);
        INode n5 = new Node("cinco",5);
        INode n6 = new Node("seis",6);
        
        instance.insert(n2);
        instance.insert(n5);
        instance.insert(n6);
        instance.insert(n1);
        instance.insert(n3);
        
        instance.print();
    
    }
    
    
}
