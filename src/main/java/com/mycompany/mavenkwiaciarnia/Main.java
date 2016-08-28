/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;



public class Main {
    public static void main(String[] args) {
        try {
            //Generating Singleton Price List
            PriceList priceList = PriceList.getInstance();
            priceList.setPrice("Daisy WHITE true", 5.43);
            priceList.setPrice("Daisy BLACK true", 3.44);
            priceList.setPrice("Daisy RED true", 2.34);
            priceList.setPrice("Daisy BLUE true", 1.23);
            priceList.setPrice("Daisy GREEN true", 9.88);
            priceList.setPrice("Daisy ORANGE true", 30.23);
            priceList.setPrice("Daisy YELLOW true", 17.56);
            priceList.setPrice("Lily WHITE 5", 6.66);
            priceList.setPrice("Lily WHITE 6", 7.77);
            priceList.setPrice("Lily BLACK 5", 8.88);
            priceList.setPrice("Lily BLACK 6", 9.99);
            priceList.setPrice("Lily RED 5", 5.55);
            priceList.setPrice("Lily RED 6", 5.55);
            priceList.setPrice("Lily BLUE 5", 4.55);
            priceList.setPrice("Lily BLUE 6", 4.44);
            priceList.setPrice("Lily GREEN 5", 4.44);
            priceList.setPrice("Lily GREEN 6", 3.45);
            priceList.setPrice("Lily ORANGE 5", 3.33);
            priceList.setPrice("Lily ORANGE 6", 3.33);
            priceList.setPrice("Lily YELLOW 5", 3.33);
            priceList.setPrice("Lily YELLOW 6", 3.33);
            priceList.setPrice("Narcissus WHITE 5", 2.22);
            priceList.setPrice("Narcissus WHITE 6", 2.22);
            priceList.setPrice("Narcissus BLACK 5", 1.11);
            priceList.setPrice("Narcissus BLACK 6", 1.11);
            priceList.setPrice("Narcissus RED 5", 12.11);
            priceList.setPrice("Narcissus RED 6", 11.44);
            priceList.setPrice("Narcissus BLUE 5", 10.23);
            priceList.setPrice("Narcissus BLUE 6", 11.22);
            priceList.setPrice("Narcissus GREEN 5", 23.55);
            priceList.setPrice("Narcissus GREEN 6", 1000.00);
            priceList.setPrice("Narcissus ORANGE 5", 345.32);
            priceList.setPrice("Narcissus ORANGE 6", 11.23);
            priceList.setPrice("Narcissus YELLOW 5", 12.11);
            priceList.setPrice("Narcissus YELLOW 6", 1.11);
            priceList.setPrice("Tulip WHITE true", 5.43);
            priceList.setPrice("Tulip BLACK true", 3.44);
            priceList.setPrice("Tulip RED true", 2.34);
            priceList.setPrice("Tulip BLUE true", 1.23);
            priceList.setPrice("Tulip GREEN true", 9.88);
            priceList.setPrice("Tulip ORANGE true", 30.23);
            priceList.setPrice("Tulip YELLOW true", 17.56);
            priceList.setPrice("ribbon", 150.23);
            priceList.setPrice("net", 44.50);
            priceList.setPrice("bow", 30.33);
            
            
            Model model = new Model(5);
            View view = new View();
            Controller controller = new Controller(model,view);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
