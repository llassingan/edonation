/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerDaftar {
    private Register view;

    public ControllerDaftar(){
        view = new Register();
        //view.addActionListener(this);
        view.setVisible(true);
    }
}
