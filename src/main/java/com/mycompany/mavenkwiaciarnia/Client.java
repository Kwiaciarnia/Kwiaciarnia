/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.util.List;


public interface Client {
    public void add(Flower flower);
    public List<Flower> get();
}
