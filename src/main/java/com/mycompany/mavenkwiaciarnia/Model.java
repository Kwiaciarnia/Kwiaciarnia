/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.util.LinkedList;
import java.util.List;


public class Model {
    private List<CashDesk> cashDesks;
    private Client client;

    public Model(int cashDeskQuantity) {
        cashDesks = new LinkedList();
        for(int i = 0 ; i < cashDeskQuantity ; i++){
            cashDesks.add(new CashDesk(i));
        }
        client = null;
    }
    
    
    
}
