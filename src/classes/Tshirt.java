/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author kwsta
 */
public class Tshirt {
   private Colour colour;
   private Size size;
   private Fabric fabric;

    public Tshirt(Colour colour, Size size, Fabric fabric) {
        this.colour = colour;
        this.size = size;
        this.fabric = fabric;
    }
    
    public double calculatePrice(){
    
    return fabric.getPrice()+ colour.getPrice() + size.getPrice();
    }
   
   
   
}
