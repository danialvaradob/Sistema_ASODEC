/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Alvarado, Roberto Rojas
 */
public class SystemFact {
    private List<Product> products = new ArrayList<>();
    
    public SystemFact() {};
    
    public void addProduct(Product _product) {
        products.add(_product);
    }
    public String getProduct(int _code) {
        String info = "No existe el producto";
        for (int i = 0; i < products.size();i++) {
            if (products.get(i).getID() == _code) {
                info = products.get(i).toString();
            }
        }
        return info;
    } 
    
    
}
