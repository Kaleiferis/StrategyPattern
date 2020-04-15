/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

/**
 *
 * @author kwsta
 */
public class PayingContext {

    private static PayingContext payingContex;

    private PayingStrategy payingStrategy;

    private PayingContext(PayingStrategy payingStrategy) {
        this.payingStrategy = payingStrategy;
    }

    public static PayingContext getPayingContext(PayingStrategy payingStrategy) {
        if (payingContex == null) {
            return new PayingContext(payingStrategy);
        }
        return payingContex;

    }
    
    public void pay(double price){
    payingStrategy.pay(price);
    }

}
