/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PRAKTIKAN
 */
public class ControllerLogin {
    private Login view;

    public ControllerLogin(){
        view = new Login();
        //view.addActionListener(this);
        view.setVisible(true);
    }
}
