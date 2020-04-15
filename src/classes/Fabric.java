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
public enum Fabric {
    WOOL(20), COTTON(30), POLYESTER(40), RAYON(60), LINEN(70), CASHMERE(80), SILK(40);

    private double price;


private Fabric(double price){
this.price= price;

}

    public double getPrice() {
        return price;
    }



}
