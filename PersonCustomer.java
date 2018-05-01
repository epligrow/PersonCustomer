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
public class PersonCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer jeff = new Customer("My name Jeff", "1234 Jeff St.", 1234567890, false);
        
        System.out.println(jeff.getName() + "\n" + jeff.getAddress() + "\n"
                + jeff.getPhone() + "\n" + jeff.isMailList());
        
        PreferredCustomer chuck = new PreferredCustomer("Chuck Noris", "Where he wants", 1111111111, true);
    
        chuck.setPurchase(550);
        
        System.out.println(chuck.getName() + "\n" + chuck.getAddress() + "\n"
                + chuck.getPhone() + "\n" + chuck.isMailList() + "\n"
                + chuck.getPurchase() + "\n" + chuck.getDiscount());
    }
    
}
