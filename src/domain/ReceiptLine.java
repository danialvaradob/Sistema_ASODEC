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
public class ReceiptLine {
    private int lineNumber;
    private Product product;
    private int qty;

    public ReceiptLine(int _lineNumber, Product _product, int _qty) {
        this.lineNumber = _lineNumber;
        this.product = _product;
        this.qty = _qty;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int _lineNumber) {
        this.lineNumber = _lineNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product _product) {
        this.product = _product;
    }

    public int getQuantity() {
        return qty;
    }

    public void setQuantity(int _qty) {
        this.qty = _qty;
    }
    
    
}
