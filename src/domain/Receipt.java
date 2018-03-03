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
public class Receipt {
    private List<ReceiptLine> receiptLines = new ArrayList<>();
    public static int receiptID;
    private boolean isPaid;
    private float paidAmount;

    public Receipt(boolean _isPaid, float _paidAmount) {
        receiptID++;
        this.isPaid = _isPaid;
        this.paidAmount = _paidAmount;
    }
    
    public void addLine(ReceiptLine _newLine) {
        this.receiptLines.add(_newLine);
    }
    
    public float getTotal() {
        float total = 0;
        int size = this.receiptLines.size();
        int qty = 0;
        for (int i = 0; i < size; i++) {
            qty = this.receiptLines.get(i).getQuantity();
            total += this.receiptLines.get(i).getProduct().getPrice() * qty;
        
        }
        
        return total;
    }
    
    public String printReceipt() {
        //todo
        return " ";
    
    }
    
    
    
    
    
    
    
}
