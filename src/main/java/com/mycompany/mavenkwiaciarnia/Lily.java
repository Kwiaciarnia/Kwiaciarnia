/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

/**
 *
 * @author Łukasz
 */
public class Lily extends Flower{
    private int blossomQuantity;
    
    public Lily(int blossomQuantity,String colour) {
        super("Lily", colour);
        this.blossomQuantity = blossomQuantity;
    }

    @Override
    public String getDescription() {
        return name + ": colour = " + colour + "; blossomQuantity = " + blossomQuantity;
    }

    @Override
    public String getSmell() {
        return "Smells like Lily with " + blossomQuantity + " blossom";
    }
    
}
