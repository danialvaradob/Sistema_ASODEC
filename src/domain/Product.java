/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Daniel Alvarado, Roberto Rojas
 */
public class Product {
    private int ID;
    private String name;
    private float price;

    public Product(int _ID, String _name, float _price) {
        this.ID = _ID;
        this.name = _name;
        this.price = _price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int _ID) {
        this.ID = _ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float _price) {
        this.price = _price;
    }
    
}
