/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;



public class Main {
    public static void main(String[] args) {
        try {
            Model model = new Model(5);
            View view = new View();
            Controller controller = new Controller(model,view);
            Customer customer = new Company(2, 2);
            Flower f = FlowerFlyWeightFactory.flyWeightFactory("Tulip",NameColourClass.Colour.GREEN);
            f = new Bow(f);
            customer.add(f);
            f = new Ribbon(f);
            f = new Bow(f);
            customer.add(f);
            
            CashDesk cash = new CashDesk(0);
            cash.serveCustomer(customer);
            System.out.println(cash.getLastReceipt());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
