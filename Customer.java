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
public class Customer extends Person{
    
    private boolean mailList;
    
    public Customer(String name, String address, int phone, boolean mailList) {
        super(name, address, phone);
        this.mailList = mailList;
    }

    public boolean isMailList() {
        return mailList;
    }

    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }
    
}
