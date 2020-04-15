
package myPackage;


public class cashPayment implements PayingStrategy{

        private double price;
        
        
    
    @Override
    public void pay(double price) {
        System.out.printf("\nAmount: %.2f paid in cash",price);
    }

    public cashPayment(double price) {
        this.price = price;
    }
    
    
    
}
