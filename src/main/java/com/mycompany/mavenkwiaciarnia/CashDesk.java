/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.util.Date;
import java.util.List;


public class CashDesk {
    private int id;
    private PriceList priceList;
    private String lastReceipt;

    public CashDesk(int id) {
        this.id = id;
        this.priceList = PriceList.getInstance();
        lastReceipt = "";
    }
    
    public double serveCustomer(Customer customer){
        List<Flower> flowers = customer.get();
        
        Double price = 0.0;
        lastReceipt = "\tReceipt\n";
        lastReceipt += "Cash deck number " + id + "\n";
        lastReceipt += new Date() + "\n";
        lastReceipt += "Products:\n";
        
        for(Flower flower : flowers){
            double p;
            try {
                p = priceList.getPrice(flower.getCatalogueDescription());
            } catch (Exception ex) {
                p = 100.0;
            }
            String[] accessories = flower.getAccessories().split(" ");
            for(int i = 1 ; i < accessories.length ; i++){
                double priceAccessories = 0.0;
                try {
                    priceAccessories = priceList.getPrice(accessories[i]);
                } catch (Exception ex) {
                    priceAccessories = 5.0;
                }
                p += priceAccessories;
            }
            lastReceipt += "\t" + flower.getDescription() + " " + p + " PLN\n";
            price += p;
        }
        lastReceipt += "\nTotal = " + price + " PLN";
        
        return price;
    }
    
    public String getLastReceipt(){
        return lastReceipt;
    }
    
    public int getID(){
        return id;
    }
}
