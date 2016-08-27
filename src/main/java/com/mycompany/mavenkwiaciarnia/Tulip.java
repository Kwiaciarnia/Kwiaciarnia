/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


public class Tulip extends NameColourClass implements Flower{

    public Tulip(NameColourClass.Colour colour) {
        super("Tulip", colour);
    }

    @Override
    public String getDescription() {
        return name + " " +colour;
    }

    @Override
    public String getSmell() {
        return "Smells like " + colour + " Tulip";
    }

    @Override
    public String getCatalogueDescription() {
        return name + " " +colour;
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
