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
public class Company implements Customer{
    //flower are packing to boxes and boxes are packing to containers
    private List<List<Flower>> flowers;
    private int maxBoxCapacity;
    private int maxContainerCapacity;

    public Company(int maxBoxCapacity, int maxContainerCapacity) {
        this.flowers = new LinkedList();
        this.maxBoxCapacity = Math.max(0, maxBoxCapacity);
        this.maxContainerCapacity = Math.max(0, maxContainerCapacity);
    }

    @Override
    public void add(Flower flower) throws Exception {
        if(flowers.size() > 0){
            List<Flower> box = flowers.get(flowers.size()-1);
            if(box.size() < maxBoxCapacity){
                box.add(flower);
            }else{
                if (flowers.size() < maxContainerCapacity) {
                    flowers.add(new LinkedList());
                    if (maxBoxCapacity > 0) {
                        flowers.get(flowers.size()-1).add(flower);
                    } else {
                        throw new Exception("Company customer already has full container");
                    }
                } else {
                    throw new Exception("Company customer already has full container");
                }
            }
        }else{
            if(maxContainerCapacity > 0){
                flowers.add(new LinkedList());
                if(maxBoxCapacity > 0){
                    flowers.get(0).add(flower);
                }else{
                    throw new Exception("Company customer already has full container");
                }
            }else{
                throw new Exception("Company customer already has full container");
            }
        }
    }

    @Override
    public boolean remove(Flower flower) {
        if(!flowers.isEmpty()){
            List<Flower> lastBox = flowers.get(flowers.size()-1);
            if(lastBox.remove(flower) == true){
                if(lastBox.isEmpty()){
                    flowers.remove(flowers.size()-1);
                }
                return true;
            } else {
                for (int i = flowers.size() - 2; i >= 0; i--) {
                    if(flowers.get(i).remove(flower)){
                        Flower f = lastBox.remove(lastBox.size()-1);
                        flowers.get(i).add(f);
                        if(lastBox.isEmpty()){
                            flowers.remove(flowers.size()-1);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<Flower> get() {
        List<Flower> list = new LinkedList();
        flowers.stream().forEach((box) -> {
            list.addAll(box);
        });
        return list;
    }

    @Override
    public Flower removeByDescription(String description) {
        Flower removed = null;
        if(!flowers.isEmpty()){
            List<Flower> lastBox = flowers.get(flowers.size()-1);
            int index = -1;
            for(int i = 0; i < flowers.size(); i++) {
                if (lastBox.get(i).getDescription().equals(description)) {
                    removed = lastBox.remove(i);
                    if (lastBox.isEmpty()) {
                        flowers.remove(flowers.size() - 1);
                    }
                    return removed;
                }
            }
            for (int i = flowers.size() - 2; i >= 0; i--) {
                for(int j = 0 ; j < flowers.get(i).size() ; j++){
                    if(flowers.get(i).get(j).getDescription().equals(description)){
                        removed = flowers.get(i).remove(j);
                        Flower f = lastBox.remove(lastBox.size() - 1);
                        flowers.get(i).add(f);
                        if (lastBox.isEmpty()) {
                            flowers.remove(flowers.size() - 1);
                        }
                        return removed;
                    }
                }
            }
        }
        return null;
    }
    
}
