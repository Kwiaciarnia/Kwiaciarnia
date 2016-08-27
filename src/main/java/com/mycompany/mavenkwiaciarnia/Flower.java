/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


public abstract class Flower {
    public enum Colour{
        WHITE, BLACK, RED, BLUE, GREEN, ORANGE, YELLOW
    }
    protected String name;
    protected Colour colour;
    
    public Flower(String name,Flower.Colour colour){
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Flower.Colour getColour() {
        return colour;
    }
    
    @Override
    public String toString(){
        return getDescription();
    }
    public abstract String getDescription();
    public abstract String getSmell();
}
