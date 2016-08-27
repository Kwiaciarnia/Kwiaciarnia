/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;


public class View extends JFrame{
    JButton exit;
    JButton individual;
    JButton company;
    JTextField indCapacity;
    JTextField comBoxCapacity;
    JTextField comConCapacity;

    public View() {
        super("Kwiaciarnia");
        setResizable(false);
        setSize(800, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2-400, d.height/2-300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        exit = new JButton("EXIT");
        exit.setVisible(true);
        exit.setBounds(250 , 150+100+100, 300 , 50);
        exit.setActionCommand("EXIT");
        
        individual = new JButton("INDIVIDUAL CUSTOMER");
        individual.setVisible(true);
        individual.setBounds(250 , 150, 300 , 50);
        individual.setActionCommand("INDIVIDUAL");
        
        company = new JButton("COMPANY CUSTOMER");
        company.setVisible(true);
        company.setBounds(250 , 150+100, 300 , 50);
        company.setActionCommand("COMPANY");
        
        indCapacity = new JTextField("Write you basket capacity");
        indCapacity.setBounds(250, 100, 300, 50);
        
        comBoxCapacity = new JTextField("Write you box capacity");
        comBoxCapacity.setBounds(250, 200, 150, 50);
        
        comConCapacity = new JTextField("Write you container capacity");
        comConCapacity.setBounds(250+150, 200, 150, 50);
        
        
        getLayeredPane().add(exit,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(individual,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(company,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(indCapacity,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(comBoxCapacity,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(comConCapacity,JLayeredPane.MODAL_LAYER);
    }
    
    public String getIndCapacity(){
        return indCapacity.getText();
    }
    
    public String getComBoxCapacity(){
        return comBoxCapacity.getText();
    }
    
    public String getComConCapacity(){
        return comConCapacity.getText();
    }
    
    public void addActionListener(ActionListener listener){
        exit.addActionListener(listener);
        individual.addActionListener(listener);
        company.addActionListener(listener);
    }

    void setShopping() {
        exit.setVisible(false);
        individual.setVisible(false);
        company.setVisible(false);
        indCapacity.setVisible(false);
        comBoxCapacity.setVisible(false);
        comConCapacity.setVisible(false);
    }
}
