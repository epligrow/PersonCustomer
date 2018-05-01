/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonCustomer;

/**
 *
 * @author eligrow
 */
public class PreferredCustomer extends Customer{

    private int purchase;
    
    public PreferredCustomer(String name, String address, int phone, boolean mailList) {
        super(name, address, phone, mailList);
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }

    public String getDiscount() {
       String discount;
       if(purchase >= 2000){
           discount = "10%";
       }else if(purchase >= 1500){
           discount = "7%";
       }else if(purchase >= 1000){
           discount = "6%";
       }else if(purchase >= 500){
           discount = "5%";
       }else{
           discount = "0%";
       }
       return discount;
    }
    
    
    
}
