/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.userenv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 *
 * @author Angga
 */
public class ControllerUserenv implements ActionListener {
    private userenv view;
    
    public ControllerUserenv(){
        view = new userenv();
        view.addActionListener(this);
        view.setVisible(true);   
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
            Object s = ae.getSource();
        if(s.equals(view.getBtngantipass())){
//            new ControllerStart();
//            view.setVisible(false);
        }else if(s.equals(view.getBtnkeluar())){
            new ControllerHome();
            view.setVisible(false);
        }  
    }
}
