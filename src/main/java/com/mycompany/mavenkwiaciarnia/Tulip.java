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
public class Tulip extends Flower {

    public Tulip(Flower.Colour colour) {
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
    
}
