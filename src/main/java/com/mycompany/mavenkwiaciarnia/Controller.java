/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("EXIT")){
            System.exit(0);
        }else if(ae.getActionCommand().equals("INDIVIDUAL")){
            int count;
            try{
                count = Math.abs(Integer.parseInt(view.getIndCapacity()));
            }catch(Exception ex){
                count = 10;
            }
            model.setCustomer(new Individual(count));
            view.setShopping();
        }else if(ae.getActionCommand().equals("COMPANY")){
            int countB;
            try{
                countB = Math.abs(Integer.parseInt(view.getComBoxCapacity()));
            }catch(Exception ex){
                countB = 10;
            }
            int countC;
            try{
                countC = Math.abs(Integer.parseInt(view.getComConCapacity()));
            }catch(Exception ex){
                countC = 10;
            }
            model.setCustomer(new Company(countB,countC));
            view.setShopping();
        }
    }
    
}
