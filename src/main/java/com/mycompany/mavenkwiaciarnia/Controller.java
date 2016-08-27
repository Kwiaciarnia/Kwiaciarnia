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
    
    public void updateView(){
        view.update();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("EXIT")){
            System.exit(0);
        }else if(ae.getActionCommand().equals("INDIVIDUAL")){
            System.exit(0);
        }else if(ae.getActionCommand().equals("COMPANY")){
            System.exit(0);
        }
    }
    
}
