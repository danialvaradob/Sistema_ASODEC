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

    public Receipt() {
        receiptID++;
        this.isPaid = false;
        this.paidAmount = 0;
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
    
    public List<ReceiptLine> getReceiptLines() {
        return receiptLines;
    }

    

    public static int getReceiptID() {
        return receiptID;
    }

    public static void setReceiptID(int receiptID) {
        Receipt.receiptID = receiptID;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public float getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(float paidAmount) {
        this.paidAmount = paidAmount;
    }
    public float getChange() {
        return this.paidAmount - this.getTotal();
    }
    
    
    public String printReceipt() {
    
    String receipt = "\n**************************************************"
            + "\n**********************RECEIPT*********************"
            + "**************************************************"
            + "\nReceipt number:\n " +  Integer.toString(receiptID)
            + "LineNumber  Name   Quantity"
            ;
    for (int i =0 ; i < receiptLines.size();i++) {
        ReceiptLine rl = receiptLines.get(i);
        receipt += "\n" + Integer.toString(i+1) +"  " 
                + rl.getProduct().getName() +  " "
                + Float.toString(rl.getProduct().getPrice()) + " * "
                + Integer.toString(rl.getQuantity());
    }
    return receipt;
    
    
    
    }
    
}
