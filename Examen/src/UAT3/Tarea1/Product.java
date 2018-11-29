/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAT3.Tarea1;

/**
 *
 * @author yago
 */
public class Product {
    private int Id;
    private String Name;
    private float Price;
    private int Stock;

    
    public Product (int id, String name, float price){
        this.Id = id;
        this.Name = name;
        this.Price = price;
    }
    
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Price
     */
    public float getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(float Price) {
        this.Price = Price;
    }
    
        /**
     * @return the Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    
    public String ToString()
    {
        return "Nombre: "+this.Name +" Precio: "+this.Price+ " Stock: "+this.Stock;
    }
}
