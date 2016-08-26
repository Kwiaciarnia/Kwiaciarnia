/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

/**
 *
 * @author Łukasz
 */
class CashDesk {
    private int id;
    private PriceList priceList;

    CashDesk(int id) {
        this.id = id;
        this.priceList = PriceList.getInstance();
    }
    
}
