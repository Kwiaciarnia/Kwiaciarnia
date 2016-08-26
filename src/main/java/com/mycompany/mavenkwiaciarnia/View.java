/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Łukasz
 */
class View extends JFrame{

    View() {
        super("Kwiaciarnia");
        setResizable(false);
        setSize(800, 600);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/2-400, d.height/2-300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void addActionListener(ActionListener listener){
        
    }
}
