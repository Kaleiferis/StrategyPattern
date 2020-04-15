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
public class BankTransferPayment implements PayingStrategy {

    private double price;

    public BankTransferPayment(double price) {
        this.price = price;
    }

    @Override
    public void pay(double price) {
        System.out.printf("\nAmount: %.2f paid in cash", price);

    }

}
