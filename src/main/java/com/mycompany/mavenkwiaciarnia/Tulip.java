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

    public Tulip(String colour) {
        super("Tulip", colour);
    }

    @Override
    public String getDescription() {
        return "Tulip: colour = " + colour; 
    }

    @Override
    public String smell() {
        return "Smells like " + colour + " Tulip";
    }
    
}
