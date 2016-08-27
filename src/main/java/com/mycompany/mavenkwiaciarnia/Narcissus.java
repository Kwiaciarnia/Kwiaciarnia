/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


public class Narcissus extends Flower{
    private int leavesQuantity;
    
    public Narcissus(Flower.Colour colour,int leavesQuantity) {
        super("Narcissus", colour);
        this.leavesQuantity = leavesQuantity;
    }

    @Override
    public String getDescription() {
        return name + " " + colour + " " + leavesQuantity;
    }

    @Override
    public String getSmell() {
        return "Smells like Narcissus with " + leavesQuantity + " leaves";
    }
}
