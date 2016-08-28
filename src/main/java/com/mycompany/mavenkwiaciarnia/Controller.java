/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller implements ActionListener{
    Model model;
    View view;
    Flower helpFlower;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if(command.equals("EXIT")){
                System.exit(0);
        }else if(command.equals("INDIVIDUAL")){
                int count;
                try{
                    count = Math.abs(Integer.parseInt(view.getIndCapacity()));
                }catch(Exception ex){
                    count = 10;
                }   model.setCustomer(new Individual(count));
                view.setShopping(model.getCashDesksID());
        }else if(command.equals("COMPANY")){
                int countB;
                try{
                    countB = Math.abs(Integer.parseInt(view.getComBoxCapacity()));
                }catch(Exception ex){
                    countB = 10;
                }   int countC;
                try{
                    countC = Math.abs(Integer.parseInt(view.getComConCapacity()));
                }catch(Exception ex){
                    countC = 10;
                }   model.setCustomer(new Company(countB,countC));
                view.setShopping(model.getCashDesksID());
        }else if(command.equals("BASKET")){
                view.setBasket(model.getCustomer().get());
        }else if(command.equals("CASHDESK")){
                try {
                    int number = view.getSelectedCashDeskNumber();
                    model.serveCustomer(number);
                    view.setServingCustomer(model.getLastReceipt(number));
                } catch (Exception ex) {
                    view.setServingCustomer("\tERROR\n" + ex.getMessage());
                }
        }else if(command.equals("OKRECEIPT")){
                view.setMainMenu();
        }else if(command.equals("ADD")){
                view.setNameColourMenu();
        }else if(command.equals("ADDFLOWER")){
            String[] text = view.getNameColour().split(" ");
            Random rand = new Random();
            switch(text[0]){
                case "Daisy":
                    helpFlower = FlowerFlyWeightFactory.flyWeightFactory("Daisy",NameColourClass.Colour.valueOf(text[1]), true);
                    break;
                case "Lily":
                    helpFlower = FlowerFlyWeightFactory.flyWeightFactory("Lily",NameColourClass.Colour.valueOf(text[1]),rand.nextInt(2)+5);
                    break;
                case "Narcissus":
                    helpFlower = FlowerFlyWeightFactory.flyWeightFactory("Narcissus",NameColourClass.Colour.valueOf(text[1]),rand.nextInt(2)+5);
                    break;
                case "Tulip":
                    helpFlower = FlowerFlyWeightFactory.flyWeightFactory("Tulip",NameColourClass.Colour.valueOf(text[1]));
                    break;
                default:
                    helpFlower = null;
                    break;
            }
            view.setAddDecorators();
        }else if(command.equals("ADDACCESSORY")){
            String decorator = view.getDecorator();
            if(helpFlower != null){
                switch(decorator){
                    case "Bow":
                        helpFlower = new Bow(helpFlower);
                        view.addDecoratorToList(decorator);
                        break;
                    case "Net":
                        helpFlower = new Net(helpFlower);
                        view.addDecoratorToList(decorator);
                        break;
                    case "Ribbon":
                        helpFlower = new Ribbon(helpFlower);
                        view.addDecoratorToList(decorator);
                        break;
                    default:
                        break;
                }
            }
        }else if(command.equals("DONEFLOWER")){
            try {
                model.getCustomer().add(helpFlower);
            } catch (Exception ex) {
                
            }
            view.setBasket(model.getCustomer().get());
        }else if(command.equals("REMOVE")){
            String description = view.getDecriptionOfFlowerToRemove();
            model.getCustomer().removeByDescription(description);
            view.setBasket(model.getCustomer().get());
        }else if(command.equals("OKBASKET")){
            view.setShopping(model.getCashDesksID());
        }
    }
}
