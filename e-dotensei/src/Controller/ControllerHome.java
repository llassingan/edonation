/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerHome {//implements ActionListener {
    private Home view;
    
    public ControllerHome(){
        view = new Home();
        //view.addActionListener(this);
        view.setVisible(true);
    }
}
