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
    private List<Receipt> receiptHistory = new ArrayList<>();
    
    public SystemFact() {};
    
    public void addProduct(Product _product) {
        products.add(_product);
    }
    public Product getProduct(int _code) {
        Product p = null;
        for (int i = 0; i < products.size();i++) {
            if (products.get(i).getID() == _code) {
                p = products.get(i);
            }
        }
        return p;
    
    } 
    
    
    public void addReceipt(Receipt _receipt) {
        this.receiptHistory.add(_receipt);
    }
    
    
}
