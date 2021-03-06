/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


public class Lily extends NameColourClass implements Flower{
    private int blossomQuantity;
    
    public Lily(NameColourClass.Colour colour,int blossomQuantity) {
        super("Lily", colour);
        this.blossomQuantity = blossomQuantity;
    }

    @Override
    public String getDescription() {
        return name + " " + colour+ " " + blossomQuantity;
    }

    @Override
    public String getSmell() {
        return "Smells like Lily with " + blossomQuantity + " blossom";
    }

    @Override
    public String getCatalogueDescription() {
        return name + " " + colour+ " " + blossomQuantity;
    }

    @Override
    public String getAccessories() {
        return "";
    }
    @Override
    public String toString(){
        return this.getDescription();
    }
}
