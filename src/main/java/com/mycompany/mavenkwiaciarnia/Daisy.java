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
public class Daisy extends Flower{
    private boolean isSmells;
    
    public Daisy(boolean isSmells) {
        super("Daisy", "White");
        this.isSmells = isSmells;
    }

    @Override
    public String getDescription() {
        return name + ": colour = " + colour + "; isSmells = " + isSmells;
    }

    @Override
    public String getSmell() {
        if(isSmells){
            return "Smells like Daisy";
        }else{
            return "It doesn't smell";
        }
    }
}
