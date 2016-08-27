/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;


public class FlowerFlyWeightFactory {
    private static final Map<String,Flower> map = new HashMap();
    
    public static Flower flyWeightFactory(String name,NameColourClass.Colour colour,Object... parameters){
        Flower flower = null;
        String f = name + " " + colour.toString();
        for(int i = 0 ; i < parameters.length ; i++){
            f += " " + parameters[i].toString();
        }
        flower = map.get(f);
        if(flower == null){
            try {
                Class classFlower = Class.forName("com.mycompany.mavenkwiaciarnia."+name);
                Constructor constructor = classFlower.getConstructors()[0];
                Object[] param = new Object[constructor.getParameterCount()];
                try {
                    for (int i = param.length - 1, j = 0; i >= 0; i--, j++) {
                        param[i] = parameters[parameters.length - 1 - j];
                    }
                } catch (Exception ex) {
                    param[0] = colour;
                }
                flower = (Flower) constructor.newInstance(param);
                map.put(flower.getCatalogueDescription(),flower);
                PriceList priceList = PriceList.getInstance();
                Double price = priceList.getPrice(flower.getCatalogueDescription());
                if(price == null){
                    priceList.setPrice(flower.getCatalogueDescription(), 50.0);
                }
                return flower;
            } catch (ClassNotFoundException ex) {
            } catch (InstantiationException ex) {
            } catch (IllegalAccessException ex) {
            } catch (IllegalArgumentException ex) {
            } catch (InvocationTargetException ex) {
            } catch(Exception ex){
            } 
            return null;
        }else{
            return flower;
        }
    }
}
