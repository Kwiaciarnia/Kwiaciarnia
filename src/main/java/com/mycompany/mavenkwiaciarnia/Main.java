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
            priceList.setPrice("Lily WHITE 5", 0);
            priceList.setPrice("Lily WHITE 6", 0);
            priceList.setPrice("Lily BLACK 5", 0);
            priceList.setPrice("Lily BLACK 6", 0);
            priceList.setPrice("Lily RED 5", 0);
            priceList.setPrice("Lily RED 6", 0);
            priceList.setPrice("Lily BLUE 5", 0);
            priceList.setPrice("Lily BLUE 6", 0);
            priceList.setPrice("Lily GREEN 5", 0);
            priceList.setPrice("Lily GREEN 6", 0);
            priceList.setPrice("Lily ORANGE 5", 0);
            priceList.setPrice("Lily ORANGE 6", 0);
            priceList.setPrice("Lily YELLOW 5", 0);
            priceList.setPrice("Lily YELLOW 6", 0);
            priceList.setPrice("Narcissus WHITE 5", 0);
            priceList.setPrice("Narcissus WHITE 6", 0);
            priceList.setPrice("Narcissus BLACK 5", 0);
            priceList.setPrice("Narcissus BLACK 6", 0);
            priceList.setPrice("Narcissus RED 5", 0);
            priceList.setPrice("Narcissus RED 6", 0);
            priceList.setPrice("Narcissus BLUE 5", 0);
            priceList.setPrice("Narcissus BLUE 6", 0);
            priceList.setPrice("Narcissus GREEN 5", 0);
            priceList.setPrice("Narcissus GREEN 6", 0);
            priceList.setPrice("Narcissus ORANGE 5", 0);
            priceList.setPrice("Narcissus ORANGE 6", 0);
            priceList.setPrice("Narcissus YELLOW 5", 0);
            priceList.setPrice("Narcissus YELLOW 6", 0);
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
