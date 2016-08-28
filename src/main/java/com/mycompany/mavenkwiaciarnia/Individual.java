/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author XXX
 */
public class Individual implements Customer{
    private List<Flower> flowers;
    private int maxCapacity;

    public Individual(int maxCapacity) {
        this.flowers = new LinkedList();
        this.maxCapacity = Math.max(0, maxCapacity);
    }
    
    

    @Override
    public void add(Flower flower) throws Exception {
        if(flowers.size() < maxCapacity){
            flowers.add(flower);
        }else{
            throw new Exception("Individual customer already has full basket");
        }
    }

    @Override
    public List<Flower> get() {
        List<Flower> list = new LinkedList();
        list.addAll(flowers);
        return list;
    }

    @Override
    public boolean remove(Flower flower) {
        return flowers.remove(flower);
    }

    @Override
    public Flower removeByDescription(String description) {
        for(int i = 0 ; i < flowers.size() ; i++){
            if(flowers.get(i).getDescription().equals(description)){
                return flowers.remove(i);
            }
        }
        return null;
    }
    
}
