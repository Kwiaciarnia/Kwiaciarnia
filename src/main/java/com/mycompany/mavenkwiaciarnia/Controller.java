/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenkwiaciarnia;

/**
 *
 * @author Łukasz
 */
class Controller {
    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    void updateView(){
        view.update();
    }
    
}
