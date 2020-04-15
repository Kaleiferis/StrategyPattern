/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassignment;

import classes.Colour;
import classes.Fabric;
import classes.Size;
import classes.Tshirt;
import java.util.ArrayList;
import java.util.List;
import myPackage.BankTransferPayment;
import myPackage.CreditCardPayment;
import myPackage.PayingContext;
import myPackage.PayingStrategy;
import myPackage.cashPayment;

/**
 *
 * @author kwsta
 */
public class StrategyAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Tshirt> cart = new ArrayList();

        Tshirt Tshirt1 = new Tshirt(Colour.BLUE, Size.L, Fabric.CASHMERE);
        Tshirt Tshirt2 = new Tshirt(Colour.GREEN, Size.M, Fabric.COTTON);
        Tshirt Tshirt3 = new Tshirt(Colour.INDIGO, Size.L, Fabric.LINEN);
        Tshirt Tshirt4 = new Tshirt(Colour.ORANGE, Size.XL, Fabric.RAYON);

        cart.add(Tshirt4);
        cart.add(Tshirt1);
        cart.add(Tshirt2);
        cart.add(Tshirt3);

        PayingContext payingContext = chooseStrategy(checkout(cart));
        payingContext.pay(checkout(cart));
    }

    public static PayingContext chooseStrategy(double price) {
        if (price < 100) {
            return PayingContext.getPayingContext(new cashPayment(price));
        } else if (price < 200) {
            return PayingContext.getPayingContext(new CreditCardPayment(price));
        } else {
            return PayingContext.getPayingContext(new BankTransferPayment(price));
        }
    }

    public static double checkout(List<Tshirt> cart) {
        double sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            sum += cart.get(i).calculatePrice();

        }
        return sum;
    }

}
