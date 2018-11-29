/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAT3.Tarea1;

import TDAList.IList;
import TDAList.INode;
import TDAList.List;
import TDAList.Node;

/**
 *
 * @author yago
 */
public class Supermarket {
    
    private IList<Product> Products;
    
    public Supermarket() {
        Products = new List<>();
    }
    
    public void AddProduct(Product newProduct){
        
        INode<Product> searchResult = Products.search(newProduct.getName().toLowerCase().trim());
        if(searchResult == null)
        {
            Products.insert(new Node<>(newProduct,newProduct.getName().toLowerCase().trim()));
        }
        else
        {
            int actualStock = searchResult.getData().getStock();         
            searchResult.getData().setStock(actualStock + 1);
        }
    }
    
    public Boolean SellProduct(Product newProduct){
        
        INode<Product> searchResult = Products.search(newProduct.getName().toLowerCase().trim());
        if(searchResult != null)
        {
            Product prodToSell = searchResult.getData();
            if(prodToSell.getStock() > 0) 
            {
                int actualStock = prodToSell.getStock();         
                prodToSell.setStock(actualStock - 1);
            }    
            
            return true;
        }
        else
        {
            return  false;
        }
    }
    
    
    public String Print()
    {
        Products.Sort();
        return Products.print();
    }
}
