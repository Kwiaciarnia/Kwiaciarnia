/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


public class Daisy extends Flower{
    private boolean isSmells;
    
    public Daisy(Flower.Colour colour,boolean isSmells) {
        super("Daisy", colour);
        this.isSmells = isSmells;
    }

    @Override
    public String getDescription() {
        return name +" " + colour + " " + isSmells;
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
