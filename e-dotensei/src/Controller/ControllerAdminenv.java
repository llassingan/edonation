/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.adminenv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerAdminenv implements ActionListener {
    private adminenv view;

    public ControllerAdminenv(){
        view = new adminenv();
        view.addActionListener(this);
        view.setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
            Object s = ae.getSource();
        if(s.equals(view.getBtnkeluaradm())){
            new ControllerLogin();
            view.setVisible(false);
        }  
    }
}
