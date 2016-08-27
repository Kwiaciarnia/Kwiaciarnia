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
    private Customer customer;

    public Model(int cashDeskQuantity) {
        cashDesks = new LinkedList();
        for(int i = 0 ; i < cashDeskQuantity ; i++){
            cashDesks.add(new CashDesk(i));
        }
        customer = null;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public List<Integer> getCashDesksID(){
        List<Integer> list = new LinkedList();
        cashDesks.stream().forEach((cashDesk) -> {
            list.add(cashDesk.getID());
        });
        return list;
    }
    
    public double serveCustomer(int cashDeskID) throws Exception {
        if (customer != null) {
            for (CashDesk cashDesk : cashDesks) {
                if (cashDesk.getID() == cashDeskID) {
                    return cashDesk.serveCustomer(customer);
                }
            }
            throw new Exception("Model hasn't cashdesk with id " + cashDeskID);
        }else{
            throw new Exception("Model hasn't set customer");
        }
    }
    
    
}
