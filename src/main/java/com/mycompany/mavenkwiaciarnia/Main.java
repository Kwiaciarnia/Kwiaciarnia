/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


public class Main {
    public static void main(String[] args) {
        Model model = new Model(5);
        View view = new View();
        Controller controller = new Controller(model,view);
        PriceList p = PriceList.getInstance();
        Flower f = FlowerFlyWeightFactory.flyWeightFactory("Tulip",Flower.Colour.GREEN);
        System.out.println(f);
    }
}
