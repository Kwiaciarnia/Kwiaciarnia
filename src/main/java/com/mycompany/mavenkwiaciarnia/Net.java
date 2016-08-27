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
public class Net extends FlowerDecorator{
    
    public Net(Flower decoratedFlower) {
        super(decoratedFlower);
    }

    @Override
    public String getDescription() {
       return decoratedFlower.getDescription() + " with net";
    }

    @Override
    public String getSmell() {
        return decoratedFlower.getSmell();
    }

    @Override
    public String getCatalogueDescription() {
        return decoratedFlower.getCatalogueDescription();
    }

    @Override
    public String getAccessories() {
        return decoratedFlower.getAccessories() + " net";
    }
    
    @Override
    public String toString(){
        return this.getDescription();
    }
}
