/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.util.List;


public interface Customer {
    public void add(Flower flower) throws Exception;
    public boolean remove(Flower flower);
    public Flower removeByDescription(String description);
    public List<Flower> get();
}
