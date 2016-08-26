/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Łukasz
 */
class PriceList {
    private static final PriceList instance = new PriceList();
    private Map<String,Double> priceMap;
    private PriceList(){
        priceMap = new HashMap();
    }
    
    public static PriceList getInstance(){
        return instance;
    }
    
    public void setPrice(String productName,double produktPrice){
        priceMap.put(productName, produktPrice);
    }
    
    public Double getPrice(String productName) throws Exception{
        Double productPrice = priceMap.get(productName);
        if(productPrice == null){
            throw new Exception("Price list does't contain product " + productName);
        }else{
            return productPrice;
        }
    }
}
