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


public class View extends JFrame{
    JButton exit;
    JButton individual;
    JButton company;

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
        
        getLayeredPane().add(exit,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(individual,JLayeredPane.MODAL_LAYER);
        getLayeredPane().add(company,JLayeredPane.MODAL_LAYER);
    }
    
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addActionListener(ActionListener listener){
        exit.addActionListener(listener);
        individual.addActionListener(listener);
        company.addActionListener(listener);
    }
}
