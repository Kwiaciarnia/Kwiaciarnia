/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

/**
 *
 * @author XXX
 */
public abstract class FlowerDecorator implements Flower{
    protected Flower decoratedFlower;
    
    public FlowerDecorator(Flower flower){
        this.decoratedFlower = flower;
    }
}
